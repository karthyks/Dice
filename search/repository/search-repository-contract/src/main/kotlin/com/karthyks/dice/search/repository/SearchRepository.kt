package com.karthyks.dice.search.repository

import com.karthyks.dice.search.models.ArtistCollection

interface SearchRepository {
    suspend fun fetchArtists(searchTerm: String, offset: Int): Result<ArtistCollection>

    companion object {
        const val PAGE_SIZE = 25
    }
}