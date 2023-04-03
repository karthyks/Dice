package com.karthyks.plugin

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class InstrumentationTestAppPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        target.group = "com.karthyks.dice.android"
        with(pluginLibs.plugins) {
            plugin(android.app)
            plugin(kotlin.android)
            plugin(kotlin.kapt)
            plugin(hilt.dagger.android)
        }
        with(libs.plugins) {
            plugin(hilt.dagger.asProvider())
        }

        with(pluginLibs) {
            implementation(hiltAndroid)
            kapt(hiltAndroidCompiler)

            androidTestImplementation(hiltAndroidTesting)
            kaptAndroidTest(hiltAndroidCompiler)

            implementation(androidx.test.core)
            implementation(androidx.test.runner)
            implementation(androidx.test.ext.junit)
            implementation(androidx.test.ext.truth)
            implementation(androidx.test.espresso.core)
            implementation(androidx.test.esrpesso.intents)
            implementation(junit)
            androidTestUtil(androidx.test.orchestrator)
        }

        target.configure<BaseAppModuleExtension> {
            configureTestApp()
            configureAndroidCommonOptions {
                vectorDrawables.useSupportLibrary = true
                testInstrumentationRunner = "com.karthyks.dice.app.test.base.CustomTestRunner"
                testInstrumentationRunnerArguments["clearPackageData"] = "true"
            }
            configureUnitTestsOptions {
                isIncludeAndroidResources = true
            }
            configureInstrumentationTestsOptions()
            configureBuildTypes()
        }
        target.configureTestTasks()
        target.configureJvm()
    }
}
