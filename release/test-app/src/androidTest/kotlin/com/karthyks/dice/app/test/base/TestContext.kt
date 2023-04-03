package com.karthyks.dice.app.test.base

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.ComposeTestRule

interface TestContext {
    fun changeContext(composeTestRule: ComposeTestRule)
    fun findNodeWithText(text: String): SemanticsNodeInteraction
    fun findNodeWithTag(tag: String): SemanticsNodeInteraction
    fun noNodeWithTag(tag: String)
    fun findFirstItemWithTag(tag: String): SemanticsNodeInteraction
    fun <T : ComponentActivity> pressBack()
    fun captureScreenshot()
    fun cleanUp()
}
