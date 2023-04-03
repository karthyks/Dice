@file:OptIn(ExperimentalCoroutinesApi::class)

package com.karthyks.dice.testframework

import com.karthyks.dice.coroutines.annotation.Test
import com.karthyks.dice.test.httpclient.MockServer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltTestApplication
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.LooperMode
import javax.inject.Inject

var MOCK_SERVER_PORT = 2221

fun getServerPort(): Int {
    return ++MOCK_SERVER_PORT
}

@Config(application = HiltTestApplication::class) // 2
@RunWith(RobolectricTestRunner::class) // 3
@LooperMode(LooperMode.Mode.PAUSED)  // 4
open class BaseTest {

    @get:Rule
    val hiltRule by lazy { HiltAndroidRule(this) }

    val mockServer by lazy { MockServer() }

    @Inject
    @Test
    lateinit var coroutineDispatcher: CoroutineDispatcher

    @Inject
    lateinit var serverPort: ServerPort


    private val testDispatcher: TestDispatcher
        get() = coroutineDispatcher as TestDispatcher

    @Before
    fun start() {
        hiltRule.inject()
        println("Server port is ${serverPort.port}")
        mockServer.start(serverPort.port)
        Dispatchers.setMain(coroutineDispatcher)
    }

    @After
    fun stop() {
        mockServer.shutdown()
        Dispatchers.resetMain()
        coroutineDispatcher.cancel()
    }

    private fun testRun(block: CoroutineScope.() -> Unit) = runTest(testDispatcher) {
        block()
    }

    fun <T> StateFlow<T>.waitForState(
        errorMessage: String = "Assertion Failed!",
        timeOutMs: Long = 2000L,
        predicate: T.() -> Boolean,
    ) {
        testRun {
            this as TestScope
            var currentValue = this@waitForState.value
            val startTime = System.currentTimeMillis()
            while (!predicate(currentValue)) {
                advanceUntilIdle()
                currentValue = this@waitForState.value
                if (System.currentTimeMillis() > startTime + timeOutMs) break
            }
            assert(predicate(currentValue)) {
                "$errorMessage Current Value: $currentValue"
            }
        }
    }

    fun <T> CoroutineScope.waitForState(
        stateFlow: StateFlow<T>,
        errorMessage: String = "Assertion Failed!",
        timeOutMs: Long = 2000L,
        predicate: T.() -> Boolean,
    ) {
        this as TestScope
        var currentValue = stateFlow.value
        val startTime = System.currentTimeMillis()
        while (!predicate(currentValue)) {
            advanceUntilIdle()
            currentValue = stateFlow.value
            if (System.currentTimeMillis() > startTime + timeOutMs) break
        }
        assert(predicate(currentValue)) {
            "$errorMessage Current Value: $currentValue"
        }
    }

    fun <T, R> CoroutineScope.assertItem(
        stateFlow: StateFlow<T>,
        propertyToAssert: T.() -> R,
        equalsTo: R,
        errorMessage: String = "Assertion Failed!",
        timeOutMs: Long = 2000L,
    ) {
        (this as TestScope)
        var currentValue = propertyToAssert(stateFlow.value)
        val startTime = System.currentTimeMillis()
        while (currentValue != equalsTo) {
            advanceUntilIdle()
            currentValue = propertyToAssert(stateFlow.value)
            if (System.currentTimeMillis() > startTime + timeOutMs) break
        }
        assert(currentValue == equalsTo) {
            "$errorMessage Current Value: $currentValue Expected value: $equalsTo"
        }
    }

    fun <T, R> CoroutineScope.assertItem(
        stateFlow: StateFlow<T>,
        onProperty: T.() -> R,
        predicate: R.() -> Boolean,
        errorMessage: String = "Assertion Failed!",
        timeOutMs: Long = 2000L,
    ) {
        (this as TestScope)
        var currentValue = onProperty(stateFlow.value)
        val startTime = System.currentTimeMillis()
        while (!predicate(currentValue)) {
            advanceUntilIdle()
            currentValue = onProperty(stateFlow.value)
            if (System.currentTimeMillis() > startTime + timeOutMs) break
        }
        assert(predicate(currentValue)) {
            "$errorMessage Current Value: $currentValue"
        }
    }

    fun <T, R> StateFlow<T>.assertItem(
        onProperty: T.() -> R,
        predicate: R.() -> Boolean,
        errorMessage: String = "Assertion Failed!",
        timeOutMs: Long = 2000L,
    ) {
        testRun {
            (this as TestScope)
            var currentValue = onProperty(this@assertItem.value)
            val startTime = System.currentTimeMillis()
            while (!predicate(currentValue)) {
                advanceUntilIdle()
                currentValue = onProperty(this@assertItem.value)
                if (System.currentTimeMillis() > startTime + timeOutMs) break
            }
            assert(predicate(currentValue)) {
                "$errorMessage Current Value: $currentValue"
            }
        }
    }
}
