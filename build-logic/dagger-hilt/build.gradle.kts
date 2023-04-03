@file:Suppress("UnstableApiUsage")

plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("dagger-android-plugins") {
            id = "hilt-dagger"
            implementationClass = "com.karthyks.plugin.DaggerHiltPlugin"
        }
    }
    plugins {
        register("dagger-core-plugins") {
            id = "hilt-dagger-core"
            implementationClass = "com.karthyks.plugin.DaggerHiltCorePlugin"
        }
    }
}

dependencies {
    implementation(files(pluginLibs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(project(":version-system"))
    implementation(pluginLibs.hiltGradlePlugin)
}
