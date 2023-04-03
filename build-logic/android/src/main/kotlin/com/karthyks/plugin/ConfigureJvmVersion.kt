package com.karthyks.plugin

import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.plugin.KotlinBasePluginWrapper
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.configureJvm() {
    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    if (plugins.any { it is KotlinBasePluginWrapper }) {
        this.tasks.withType(KotlinCompile::class.java).configureEach {
            kotlinOptions.apply {
                allWarningsAsErrors = true
                jvmTarget = "11"
                freeCompilerArgs = freeCompilerArgs + "-opt-in=kotlin.RequiresOptIn"
            }
        }
    }
}
