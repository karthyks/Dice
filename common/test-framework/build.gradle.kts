import com.karthyks.plugin.Projects

plugins {
    id("test-lib")
}
group = "${group}.common"

android {
    namespace = "com.karthys.dice.android.testlib"
}

dependencies {
    implementation(pluginLibs.hiltAndroidTesting)
    kapt(pluginLibs.hiltAndroidCompiler)

    implementation(libs.moshi)
    implementation(libs.coroutines.test)
    implementation(Projects.network.testClient)
    implementation(Projects.network.networkDI)
    implementation(Projects.network.networkConfig)
    implementation(Projects.common.coroutinesAnnotation)
}