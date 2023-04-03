package com.karthyks.plugin

import org.gradle.api.Project

fun Project.addCleanTasks() {
    tasks.register("clean") {
        group = "build"
        description = "Run clean on all modules"
        executeAllIncludedTasks(this, "clean")
    }
}
