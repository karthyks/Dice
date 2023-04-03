@file:Suppress("DEPRECATION")

package com.karthyks.dice.app.test.base

import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.idling.CountingIdlingResource
import androidx.test.runner.screenshot.Screenshot
import com.karthyks.dice.app.test.mock.CustomScreenshotProcessor
import javax.inject.Inject

abstract class BaseInstrumentationTest {

    @Inject
    lateinit var customScreenshotProcessor: CustomScreenshotProcessor

    @Inject
    lateinit var idlingResources: Set<CountingIdlingResource>

    lateinit var testContext: TestContext

    open fun start() {
        Screenshot.setScreenshotProcessors(setOf(customScreenshotProcessor))
        idlingResources.forEach {
            IdlingRegistry.getInstance().register(it)
        }
        testContext = TestContextImpl()
    }

    open fun stop() {
        testContext.cleanUp()
        idlingResources.forEach {
            IdlingRegistry.getInstance().unregister(it)
        }
    }


    fun onTestContext(composeTestRule: ComposeTestRule, block: TestContext.() -> Unit) {
        testContext.changeContext(composeTestRule)
        testContext.block()
    }

    companion object {
        const val IDLING_TIME = 10_000L
        const val BACKGROUND_IDLER = "BackgroundIdlingResource"
    }
}
