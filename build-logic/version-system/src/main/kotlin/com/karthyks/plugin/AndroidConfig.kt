package com.karthyks.plugin

object AndroidConfig {
    val sdk = Sdk
    val app = App
    val testApp = TestApp

    object Sdk {
        const val compileSdkVersion = 33
        const val minVersion = 21
        const val targetSdkVersion = 33
    }

    object App {
        const val appId: String = "com.karthyks.sample.dice.app"
        val versionCode: Int get() = System.getenv("APP_VERSION_CODE")?.toIntOrNull() ?: 1
        val versionName: String get() = System.getenv("APP_VERSION_NAME") ?: "1.0.0"
    }

    object TestApp {
        const val appId: String = "com.karthyks.dice.app.test"
        const val versionCode = 1
        const val versionName = "1.0.0"
    }
}
