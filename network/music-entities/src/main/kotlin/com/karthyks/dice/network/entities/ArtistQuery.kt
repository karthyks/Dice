package com.karthyks.dice.network.entities

data class ArtistQuery(
    private val name: String,
    val offset: Int,
    val limit: Int
) {
    val artistName: String
        get() = "artist:$name"
}