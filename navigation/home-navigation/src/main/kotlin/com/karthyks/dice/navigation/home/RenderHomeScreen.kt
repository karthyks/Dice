package com.karthyks.dice.navigation.home

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.karthyks.dice.search.RenderSearchScreen
import io.github.karthyks.composed.LocalOverlayProvider
import io.github.karthyks.composed.ProvideOverlay

fun ComponentActivity.renderHomeScreen() {
    setContent {
        ProvideOverlay {
            val overlayProvider = LocalOverlayProvider.current
            RenderSearchScreen {
                overlayProvider.showOverlay(SearchDetailsOverlay(it))
            }
        }
    }
}