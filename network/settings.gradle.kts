apply(from = "../gradle/settings/build-logic-settings.gradle.kts")
apply(from = "../gradle/settings/version-catalog-settings.gradle.kts")

rootProject.name = "network"

include(":http-client")
include(":music-entities")
include(":network-config-provider")
include(":music-brainz-service")
include(":network-di")
include(":test-http-client")