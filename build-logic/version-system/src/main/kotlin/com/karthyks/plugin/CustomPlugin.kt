package com.karthyks.plugin

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.accessors.dm.LibrariesForPluginLibs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the

abstract class CustomPlugin : Plugin<Project> {
    lateinit var libs: LibrariesForLibs
    lateinit var pluginLibs: LibrariesForPluginLibs
    lateinit var project: Project
    override fun apply(target: Project) {
        project = target
        libs = project.the()
        pluginLibs = project.the()
    }
}
