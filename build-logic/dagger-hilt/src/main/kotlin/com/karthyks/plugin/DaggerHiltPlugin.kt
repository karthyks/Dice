@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import org.gradle.api.Project

class DaggerHiltPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        plugin(pluginLibs.plugins.kotlin.kapt)
        plugin(pluginLibs.plugins.hilt.dagger.android)

        implementation(pluginLibs.hiltAndroid)
        kapt(pluginLibs.hiltAndroidCompiler)
    }
}
