@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaBasePlugin
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.api.tasks.testing.Test
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePluginWrapper
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class KotlinBasePlugin : CustomPlugin() {
    override fun apply(target: Project) {
        super.apply(target)
        plugin(pluginLibs.plugins.kotlin.jvm)
        testImplementation(pluginLibs.junit)

        when {
            target.plugins.any { plugin -> plugin is KotlinBasePluginWrapper } -> {
                target.tasks.withType(KotlinCompile::class.java).configureEach {
                    kotlinOptions.apply {
                        allWarningsAsErrors = true
                        jvmTarget = "11"
                        freeCompilerArgs = freeCompilerArgs + "-opt-in=kotlin.RequiresOptIn"
                    }
                }
            }
            target.plugins.any { plugin -> plugin is JavaBasePlugin } -> {
                target.tasks.withType(JavaCompile::class.java).configureEach {
                    sourceCompatibility = JavaVersion.VERSION_11.toString()
                    targetCompatibility = JavaVersion.VERSION_11.toString()
                }
            }
        }
        target.tasks.withType(Test::class.java).configureEach {
            ignoreFailures = true
            maxParallelForks = Runtime.getRuntime().availableProcessors() / 2
        }
    }
}
