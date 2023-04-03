@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    var sourceDir = rootDir
    while (sourceDir.listFiles { _, name -> name == "root.project" }.isNullOrEmpty()) {
        sourceDir = File(sourceDir.parent)
    }
    versionCatalogs {
        create("libs") {
            from(files("${sourceDir.path}/gradle/libs.versions.toml"))
        }
        create("pluginLibs") {
            from(files("${sourceDir.path}/gradle/plugin-libs.versions.toml"))
        }
    }
}
