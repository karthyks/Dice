package com.karthyks.plugin

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.initialization.IncludedBuild
import org.gradle.api.tasks.TaskReference


fun Project.executeAllIncludedTasks(
    task: Task,
    taskName: String,
    excludeModules: List<String> = emptyList(),
    moduleFilter: (IncludedBuild, String) -> Boolean = { _, _ -> true },
) {
    project.getAllTasks(taskName, excludeModules, moduleFilter).forEach(task::dependsOn)
}

private fun Project.getAllTasks(
    taskName: String,
    excludeModules: List<String> = emptyList(),
    moduleFilter: (IncludedBuild, String) -> Boolean = { _, _ -> true },
): List<TaskReference> {
    return getAllModules(excludeModules)
        .map { (includedBuild: IncludedBuild, modules: List<String>) ->
            includedBuild to modules.filter { module ->
                moduleFilter(includedBuild, module)
            }
        }
        .flatMap { (includedBuild: IncludedBuild, modules: List<String>) ->
            modules.map { module ->
                if (module.isNotBlank()) {
                    includedBuild.task(":$module:$taskName")
                } else null
            }
        }.mapNotNull { it }
}

/**
 * This utility method will collect all the modules in the included builds (subprojects).
 * For each subproject, it will open the "settings.gradle.kts" and find all the modules specified in it.
 */
private fun Project.getAllModules(excludeModules: List<String>): Map<IncludedBuild, List<String>> {
    return gradle.includedBuilds
        .filter { it.name !in listOf("build-logic", "platforms") }
        .associateWith { includedBuild ->
            val settingsFile = includedBuild.projectDir.listFiles { file ->
                file.name == "settings.gradle.kts"
            }?.firstOrNull()?.readText().orEmpty()
            val regex = """include\("(.*)"\)""".toRegex()
            regex.findAll(settingsFile).mapNotNull { result: MatchResult ->
                result.groupValues.getOrNull(1)
            }.toList().filter { it !in excludeModules }
        }
}