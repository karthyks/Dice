package com.karthyks.dice.network.entities

interface ArtistListEntity {
    val offset: Int
    val artists: List<ArtistEntity>
}