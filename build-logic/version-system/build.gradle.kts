plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(files(pluginLibs.javaClass.protectionDomain.codeSource.location))
    implementation(files(libs.javaClass.protectionDomain.codeSource.location))
}
