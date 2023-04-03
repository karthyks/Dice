@file:Suppress("UnstableApiUsage")

plugins {
    id("java-platform")
}

group = "com.karthyks.platform"

javaPlatform.allowDependencies()

repositories {
    gradlePluginPortal()
}

dependencies {
    constraints {
        api(pluginLibs.androidGradlePlugin)
        api(pluginLibs.kotlinAndroidGradlePlugin)
        api(pluginLibs.kotlinGradlePlugin)
    }
}
