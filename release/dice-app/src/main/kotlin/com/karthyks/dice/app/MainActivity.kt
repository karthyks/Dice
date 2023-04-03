package com.karthyks.dice.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.karthyks.dice.navigation.home.renderHomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        renderHomeScreen()
    }
}
