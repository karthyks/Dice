apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../platforms")

rootProject.name = "build-logic"

include("version-system")
include("dagger-hilt")
include("android")
include("kotlin-library")
include("android-application")
include("gradle-tasks")
