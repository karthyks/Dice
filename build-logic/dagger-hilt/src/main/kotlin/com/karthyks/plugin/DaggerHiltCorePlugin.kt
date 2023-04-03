@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import org.gradle.api.Project

class DaggerHiltCorePlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        plugin(pluginLibs.plugins.kotlin.kapt)
        implementation(pluginLibs.hiltCore)
        kapt(pluginLibs.hiltKotlinCompiler)
    }
}
