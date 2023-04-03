package com.karthyks.plugin

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class TestAppPlugin : CustomPlugin() {
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

        implementation(libs.viewModel.compose)
        implementation(libs.savedstate)
        implementation(libs.androidx.core)

        target.configure<BaseExtension> {
            buildFeatures.compose = true
            composeOptions {
                kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
            }
        }

        with(pluginLibs) {
            implementation(hiltAndroid)
            kapt(hiltAndroidCompiler)

            platformImplementation(libs.androidx.compose.bom)
            implementation(libs.androidx.compose.ui)
            implementation(libs.androidx.compose.uiTooling)
            implementation(libs.androidx.compose.foundation)
            implementation(libs.androidx.compose.foundationLayout)
            implementation(libs.androidx.compose.material)

            testImplementation(hiltAndroidTesting)
            kaptTest(hiltAndroidCompiler)
            testImplementation(roboelectric)
            testImplementation(junit)

            platformImplementation(libs.androidx.compose.bom)
            implementation(libs.androidx.compose.ui)
            implementation(libs.androidx.compose.uiTooling)
            implementation(libs.androidx.compose.foundation)
            implementation(libs.androidx.compose.foundationLayout)
            implementation(libs.androidx.compose.material)

            implementation(libs.androidx.compose.testJunitVersioned)
            implementation(libs.androidx.compose.uiManifestVersioned)
        }
        testImplementation(libs.mockito)

        target.configure<BaseAppModuleExtension> {
            configureTestApp()
            configureAndroidCommonOptions {
                vectorDrawables.useSupportLibrary = true
                testInstrumentationRunner = "com.karthyks.dice.test.CustomTestRunner"
            }
            configureUnitTestsOptions {
                isIncludeAndroidResources = true
            }
        }
        target.configureTestTasks()
        target.configureJvm()
    }
}
