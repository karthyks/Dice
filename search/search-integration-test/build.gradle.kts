import com.karthyks.plugin.Projects

plugins {
    id("test-app-plugin")
}

group = "$group.search"

android {
    namespace = "com.karthys.dice.search.test"
}

dependencies {
    implementation(project(":search-presentation"))

    testImplementation(Projects.common.coroutinesAnnotation)
    testImplementation(Projects.common.testFramework)
    testImplementation(Projects.network.testClient)
}
