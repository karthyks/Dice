import com.karthyks.plugin.Projects

plugins {
    id("test-app-plugin")
}

group = "$group.search-details"

android {
    namespace = "com.karthys.dice.searchdetails.test"
}

dependencies {
    implementation(project(":search-details-presentation"))

    testImplementation(Projects.common.coroutinesAnnotation)
    testImplementation(Projects.common.testFramework)
    testImplementation(Projects.network.testClient)
}
