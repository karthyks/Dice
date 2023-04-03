package com.karthyks.plugin

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class TestableAndroidPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        target.group = "com.karthyks.dice.android"
        plugin(pluginLibs.plugins.android.library)
        plugin(pluginLibs.plugins.kotlin.android)
        plugin(pluginLibs.plugins.kotlin.kapt)
        plugin(pluginLibs.plugins.hilt.dagger.android)

        implementation(pluginLibs.hiltAndroid)
        implementation(pluginLibs.hiltAndroidTesting)
        kaptTest(pluginLibs.hiltAndroidCompiler)

        implementation(libs.mockito)


        implementation(pluginLibs.roboelectric)
        implementation(pluginLibs.junit)
        implementation(pluginLibs.androidx.test.core)
        implementation(pluginLibs.androidx.test.runner)
        implementation(pluginLibs.androidx.test.ext.junit)
        implementation(pluginLibs.androidx.test.ext.truth)
        implementation(pluginLibs.androidx.test.espresso.core)
        implementation(pluginLibs.androidx.test.esrpesso.intents)

        implementation(libs.viewModel.compose)
        implementation(libs.savedstate)
        implementation(libs.androidx.core)

        target.configure<BaseExtension> {
            buildFeatures.compose = true
            composeOptions {
                kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
            }
        }

        target.configure<LibraryExtension> {
            configureAndroidCommonOptions {
                testInstrumentationRunner = "com.karthyks.dice.testframework.instrumentation.CustomTestRunner"
                testInstrumentationRunnerArguments["clearPackageData"] = "true"
            }
            configureUnitTestsOptions()
        }
        target.configureJvm()
        target.configureTestTasks()
    }
}
