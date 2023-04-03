apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../network")
includeBuild("../common")
includeBuild("../navigation")
includeBuild("../search")
includeBuild("../search-details")

rootProject.name = "release"

include(":dice-app")
include(":test-app")