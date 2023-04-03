package com.karthyks.dice.app.test

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performTextInput
import androidx.test.filters.LargeTest
import com.karthyks.dice.app.test.base.BaseInstrumentationTest
import com.karthyks.dice.compose.test.TestTag
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@LargeTest
@HiltAndroidTest
class MainActivityTest : BaseInstrumentationTest() {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    var composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    override fun start() {
        hiltRule.inject()
        super.start()
    }

    @After
    override fun stop() {
        super.stop()
    }

    @Test
    fun shouldRenderScreen() {
        onTestContext(composeRule) {
            findNodeWithTag(TestTag.searchScreen.searchField).performTextInput("fred")
            findNodeWithTag(TestTag.searchScreen.searchField).performImeAction()
            findNodeWithTag(TestTag.searchScreen.artistList).assertExists()
            findNodeWithTag(TestTag.searchScreen.pleaseWait).assertExists()
            findFirstItemWithTag(TestTag.searchScreen.artistItem).performClick()

            findNodeWithTag(TestTag.searchDetailsScreen.closeBtn).assertExists()
            findNodeWithTag(TestTag.searchDetailsScreen.nameTopBar).assertExists()
            findNodeWithTag(TestTag.searchDetailsScreen.recordingList).assertExists()
        }
    }
}