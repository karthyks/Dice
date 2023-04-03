plugins {
    id("kotlin-library")
}

group = "${group}.network"

dependencies {
    implementation(libs.mockwebserver)
    implementation(libs.retrofit.moshi)
    implementation(libs.moshi)
    implementation(libs.jsonAssert)
}
