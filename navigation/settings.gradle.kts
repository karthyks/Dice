apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

includeBuild("../common")
includeBuild("../search-details")
includeBuild("../search")

rootProject.name = "navigation"

include(":home-navigation")