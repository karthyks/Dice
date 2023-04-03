@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import org.gradle.api.Project

class KotlinLibraryPlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        target.group = "com.karthyks.dice"
        plugin(pluginLibs.plugins.java.library)
        plugin(KotlinBasePlugin::class.java)
    }
}
