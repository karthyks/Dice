@file:Suppress("UnstableApiUsage")

package com.karthyks.plugin

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

internal fun BaseAppModuleExtension.configureAndroidApp() {
    buildToolsVersion = buildToolsVersion

    defaultConfig {
        applicationId = AndroidConfig.app.appId
        versionCode = AndroidConfig.app.versionCode
        versionName = AndroidConfig.app.versionName
    }

    lint {
        checkDependencies = true
        ignoreTestSources = true
    }
}

internal fun BaseAppModuleExtension.configureTestApp() {
    buildToolsVersion = buildToolsVersion

    defaultConfig {
        applicationId = AndroidConfig.testApp.appId
        versionCode = AndroidConfig.testApp.versionCode
        versionName = AndroidConfig.testApp.versionName
    }

    lint {
        ignoreTestSources = true
    }
}
