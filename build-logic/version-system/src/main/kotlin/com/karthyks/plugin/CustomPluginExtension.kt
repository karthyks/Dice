@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import org.gradle.api.Plugin
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.dependencies
import org.gradle.plugin.use.PluginDependency

fun CustomPlugin.plugin(plugin: Provider<PluginDependency>) {
    plugin(plugin.get().pluginId)
}

fun CustomPlugin.plugin(id: String) {
    project.plugins.apply(id)
}

fun <T: Plugin<*>> CustomPlugin.plugin(type: Class<T>) {
    project.plugins.apply(type)
}

fun CustomPlugin.implementation(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("implementation", dependency)
}

fun CustomPlugin.platformImplementation(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("implementation", project.dependencies.platform(dependency))
}

fun CustomPlugin.implementation(dependency: String) {
    project.dependencies.add("implementation", dependency)
}

fun CustomPlugin.kapt(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("kapt", dependency)
}

fun CustomPlugin.kaptTest(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("kaptTest", dependency)
}

fun CustomPlugin.kaptAndroidTest(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("kaptAndroidTest", dependency)
}

fun CustomPlugin.testImplementation(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("testImplementation", dependency)
}

fun CustomPlugin.androidTestImplementation(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("androidTestImplementation", dependency)
}

fun CustomPlugin.androidTestUtil(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("androidTestUtil", dependency)
}

fun CustomPlugin.debugImplementation(dependency: Provider<MinimalExternalModuleDependency>) {
    project.dependencies.add("debugImplementation", dependency)
}
