package com.karthyks.plugin

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.TestOptions
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test

internal fun BaseExtension.configureUnitTestsOptions(onUnitTest: TestOptions.UnitTestOptions.() -> Unit = {}) {
    testOptions {
        unitTests.isReturnDefaultValues = true
        unitTests.onUnitTest()
    }
}

internal fun BaseExtension.configureInstrumentationTestsOptions() {
    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
        unitTests.isReturnDefaultValues = true
        unitTests.isIncludeAndroidResources = true
//        animationsDisabled = true
    }
}

internal fun Project.configureTestTasks(onTest: Test.() -> Unit = {}) {
    tasks.withType(Test::class.java).configureEach {
        ignoreFailures = true
        maxParallelForks = Runtime.getRuntime().availableProcessors() / 2
        onTest()
    }
}
