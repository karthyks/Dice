import com.karthyks.plugin.Projects

plugins {
    id("android-lib-plugin")
}

group = "${group}.navigation"

android {
    namespace = "com.karthyks.dice.navigation.home"
}

dependencies {
    implementation(libs.activity.compose)
    implementation(libs.composed)

    implementation(Projects.search.searchPresentation)
    implementation(Projects.searchDetails.searchDetailsPresentation)
}