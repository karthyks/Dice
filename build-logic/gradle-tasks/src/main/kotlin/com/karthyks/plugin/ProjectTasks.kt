package com.karthyks.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ProjectTasks : Plugin<Project> {
    override fun apply(target: Project) {
        val rootProject = target.gradle.parent?.rootProject ?: return // Choose rootProject
        with(rootProject) {
            addCleanTasks()
        }
    }
}
