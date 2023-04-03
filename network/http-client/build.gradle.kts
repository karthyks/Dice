plugins {
    id("kotlin-library")
}

group = "${group}.network"

dependencies {
    implementation(libs.coroutines.core)

    implementation(libs.retrofit)
    implementation(libs.retrofit.moshi)
    implementation(libs.moshi)

    implementation(project(":music-entities"))

    implementation(project(":network-config-provider"))

    testImplementation(libs.coroutines.test)
}