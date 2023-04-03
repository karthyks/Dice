@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        target.group = "com.karthyks.dice.android"
        plugin(pluginLibs.plugins.android.library)
        plugin(pluginLibs.plugins.kotlin.android)
        testImplementation(pluginLibs.junit)

        platformImplementation(libs.androidx.compose.bom)
        implementation(libs.androidx.compose.ui)
        implementation(libs.androidx.compose.uiTooling)
        implementation(libs.androidx.compose.foundation)
        implementation(libs.androidx.compose.foundationLayout)
        implementation(libs.androidx.compose.material)

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
            configureAndroidCommonOptions()
            configureUnitTestsOptions()
        }
        target.configureJvm()
        target.configureTestTasks()
    }
}
