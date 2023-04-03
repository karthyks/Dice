plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

gradlePlugin {
    plugins.register("kotlin-library-plugin") {
        id = "kotlin-library"
        implementationClass = "com.karthyks.plugin.KotlinLibraryPlugin"
    }
}

dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(files(pluginLibs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(platform("com.karthyks.platform:plugins-platform"))
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")

    implementation(project(":version-system"))
}
