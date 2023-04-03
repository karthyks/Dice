import com.karthyks.plugin.Projects

plugins {
    id("android-app-plugin")
    id("hilt-dagger")
}

android {
    namespace = "com.karthyks.dice.app"
}

dependencies {

    implementation(Projects.navigation.homeNavigation)

    implementation(Projects.network.networkDI)
    implementation(Projects.network.networkConfig)
    implementation(Projects.common.coroutinesProvider)
}