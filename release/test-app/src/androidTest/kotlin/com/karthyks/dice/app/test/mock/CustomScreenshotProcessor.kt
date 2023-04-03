@file:Suppress("DEPRECATION")

package com.karthyks.dice.app.test.mock

import android.content.Context
import androidx.test.runner.screenshot.BasicScreenCaptureProcessor
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import org.junit.Test

class CustomScreenshotProcessor @Inject constructor(@ApplicationContext context: Context) : BasicScreenCaptureProcessor() {
    init {
        mTag = "CustomScreenCaptureProcessor"
        mDefaultFilenamePrefix = "customScreenshot"
        mDefaultScreenshotPath = context.getExternalFilesDir("/screenshots")
    }

    override fun getDefaultFilename(): String? {
        for (element in Thread.currentThread().stackTrace) {
            val elementClassName = element.className
            val elementMethodName = element.methodName
            if (isJUnit4Test(elementClassName, elementMethodName)) {
                return getFilename(elementClassName + mFileNameDelimiter + elementMethodName)
            }
        }
        return getFilename("UnknownTestClass" + mFileNameDelimiter + "unknownTestMethod")
    }

    /**
     * Returns whether the given method inside the given class is a Junit4 test method.
     */
    private fun isJUnit4Test(elementClassName: String, elementMethodName: String): Boolean {
        try {
            val clazz = Class.forName(elementClassName)
            for (method in clazz.methods) {
                if (method.name == elementMethodName &&
                    method.isAnnotationPresent(Test::class.java)
                ) {
                    return true
                }
            }
        } catch (ignore: ClassNotFoundException) {
            return false
        }
        return false
    }
}

