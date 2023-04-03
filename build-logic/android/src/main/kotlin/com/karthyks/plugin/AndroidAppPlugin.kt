@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidAppPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        with(pluginLibs.plugins) {
            plugin(android.app)
            plugin(kotlin.android)
            plugin(gradle.tasks)
        }
        with(libs.plugins) {
            plugin(hilt.dagger.asProvider())
        }

        testImplementation(pluginLibs.junit)

        target.configure<BaseAppModuleExtension> {
            configureAndroidApp()
            configureAndroidCommonOptions {
                vectorDrawables.useSupportLibrary = true
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
            configureBuildTypes()
            configureUnitTestsOptions()
        }
        target.configureJvm()
        target.configureTestTasks()
    }
}
