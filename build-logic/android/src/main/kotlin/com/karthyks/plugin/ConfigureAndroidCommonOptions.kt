package com.karthyks.plugin

import com.android.build.api.dsl.DefaultConfig
import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

internal fun BaseExtension.configureAndroidCommonOptions(onDefaultConfig: DefaultConfig.() -> Unit = {}) {
    compileSdkVersion(AndroidConfig.sdk.compileSdkVersion)
    defaultConfig {
        minSdk = AndroidConfig.sdk.minVersion
        targetSdk = AndroidConfig.sdk.targetSdkVersion
        this.onDefaultConfig()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets.forEach { sourceSet ->
        sourceSet.java.srcDir("src/${sourceSet.name}/kotlin")
    }
}
