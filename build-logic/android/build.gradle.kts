plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("android-lib-plugin") {
            id = "android-lib-plugin"
            implementationClass = "com.karthyks.plugin.AndroidLibraryPlugin"
        }
        register("android-app-plugin") {
            id = "android-app-plugin"
            implementationClass = "com.karthyks.plugin.AndroidAppPlugin"
        }
        register("test-app-plugin") {
            id = "test-app-plugin"
            implementationClass = "com.karthyks.plugin.TestAppPlugin"
        }
        register("test-lib") {
            id = "test-lib"
            implementationClass = "com.karthyks.plugin.TestableAndroidPlugin"
        }
        register("instrumentation") {
            id = "instrumentation"
            implementationClass = "com.karthyks.plugin.InstrumentationTestAppPlugin"
        }
        register("compose-test") {
            id = "compose-test"
            implementationClass = "com.karthyks.plugin.ComposeTestPlugin"
        }
    }
}

dependencies {
    implementation(files(pluginLibs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(platform("com.karthyks.platform:plugins-platform"))
    implementation("com.android.tools.build:gradle")
    implementation("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin")
    implementation(project(":version-system"))
    implementation(project(":dagger-hilt"))
    implementation(project(":gradle-tasks"))
}
