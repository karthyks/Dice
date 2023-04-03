package com.karthyks.dice.navigation.home

import com.karthyks.dice.searchdetails.RenderSearchDetailsScreen
import io.github.karthyks.composed.Overlay
import io.github.karthyks.composed.ViewHolder
import io.github.karthyks.composed.viewHolder

class SearchDetailsOverlay(private val artistID: String) : Overlay {
    override val viewHolder: ViewHolder by viewHolder {
        RenderSearchDetailsScreen(artistID = artistID) {
            it.dispose()
        }
    }
}