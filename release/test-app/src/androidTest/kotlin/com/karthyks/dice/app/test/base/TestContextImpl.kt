@file:Suppress("DEPRECATION")

package com.karthyks.dice.app.test.base

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.test.espresso.IdlingRegistry
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.runner.screenshot.ScreenCapture
import androidx.test.runner.screenshot.Screenshot

class TestContextImpl : TestContext {

    private lateinit var composeTestRule: ComposeTestRule

    private val capturedShots: MutableList<ScreenCapture> = mutableListOf()

    private var latestTag: String = ""

    override fun changeContext(composeTestRule: ComposeTestRule) {
        this.composeTestRule = composeTestRule
    }

    override fun findNodeWithText(text: String): SemanticsNodeInteraction {
        this.latestTag = text
        composeTestRule.waitForAllTasks()
        return composeTestRule.onNodeWithText(text)
    }

    override fun findNodeWithTag(tag: String): SemanticsNodeInteraction {
        this.latestTag = tag
        composeTestRule.waitForAllTasks()
        waitForTag(tag)
        return composeTestRule.onNodeWithTag(tag)
    }

    override fun noNodeWithTag(tag: String) {
        if (this.latestTag == tag) latestTag = ""
        composeTestRule.waitForAllTasks()
        return composeTestRule.onNodeWithTag(tag).assertDoesNotExist()
    }

    override fun findFirstItemWithTag(tag: String): SemanticsNodeInteraction {
        this.latestTag = tag
        composeTestRule.waitForAllTasks()
        waitForTag(tag)
        return composeTestRule.onAllNodesWithTag(tag).onFirst()
    }

    override fun captureScreenshot() {
        capturedShots.add(Screenshot.capture())
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ComponentActivity> pressBack() {
        (composeTestRule as AndroidComposeTestRule<ActivityScenarioRule<T>, T>).activityRule.scenario.onActivity {
            it.onBackPressedDispatcher.onBackPressed()
        }
    }

    override fun cleanUp() {
        capturedShots.forEach { it.process() }
        capturedShots.clear()
    }

    private fun waitForTag(tag: String) {
        composeTestRule.waitUntil(BaseInstrumentationTest.IDLING_TIME) {
            composeTestRule.onAllNodesWithTag(tag).fetchSemanticsNodes().isNotEmpty()
        }
    }

    private fun ComposeTestRule.waitForAllTasks() {
        val idlingResources = IdlingRegistry.getInstance().resources
        waitUntil(BaseInstrumentationTest.IDLING_TIME) { idlingResources.all { it.isIdleNow } }
    }
}
