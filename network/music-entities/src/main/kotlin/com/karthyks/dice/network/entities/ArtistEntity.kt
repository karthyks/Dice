package com.karthyks.dice.network.entities

interface ArtistEntity {
    val id: String
    val name: String?
    val score: Int?
    val gender: String?
    val country: String?
    val lifeSpan: ArtistLifeSpanEntity?
    val recordings: List<RecordingEntity>?
}