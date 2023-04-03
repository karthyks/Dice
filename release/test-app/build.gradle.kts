import com.karthyks.plugin.Projects

plugins {
    id("instrumentation")
    id("compose-test")
}

android {
    namespace = "com.karthyks.dice.app.test"
}

dependencies {
    implementation(Projects.navigation.homeNavigation)

    implementation(Projects.network.networkDI)
    implementation(Projects.network.httpClient)
    implementation(Projects.network.networkConfig)
    implementation(Projects.common.coroutinesProvider)
    implementation(Projects.common.composeTestContract)
    
    implementation(libs.moshi)
}
