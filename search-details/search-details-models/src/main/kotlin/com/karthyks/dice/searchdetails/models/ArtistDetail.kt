package com.karthyks.dice.searchdetails.models

data class ArtistDetail(
    val id: String,
    val name: String,
    val country: String,
    val isAlive: Boolean,
    val recordings: List<Recording>
)

