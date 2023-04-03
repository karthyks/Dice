pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    var sourceDir = rootDir
    while (sourceDir.listFiles { _, name -> name == "root.project" }.isNullOrEmpty()) {
        sourceDir = File(sourceDir.parent)
    }
    includeBuild("${sourceDir.path}/build-logic")
}
