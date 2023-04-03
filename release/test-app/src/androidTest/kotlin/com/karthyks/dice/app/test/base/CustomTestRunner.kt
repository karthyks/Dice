package com.karthyks.dice.app.test.base

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.os.StrictMode
import androidx.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication

class CustomTestRunner : AndroidJUnitRunner() {

    override fun onCreate(arguments: Bundle?) {
        super.onCreate(arguments)
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())
    }

    override fun newApplication(cl: ClassLoader?, name: String?, context: Context?): Application {
        return super.newApplication(cl, HiltTestApplication::class.java.name, context)
    }
}
