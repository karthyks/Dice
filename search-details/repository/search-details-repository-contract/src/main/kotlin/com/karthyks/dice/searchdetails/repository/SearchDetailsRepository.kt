package com.karthyks.dice.searchdetails.repository

import com.karthyks.dice.searchdetails.models.ArtistDetail

interface SearchDetailsRepository {
    suspend fun fetchArtistDetails(artistID: String): Result<ArtistDetail>
}