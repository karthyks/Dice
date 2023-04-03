package com.karthyks.dice.network.endpoint

import com.karthyks.dice.network.models.response.ArtistResponse
import com.karthyks.dice.network.models.response.FetchArtistsResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MusicBrainzEndpoint {
    @GET("artist/")
    suspend fun fetchArtists(
        @Query("query") artist: String,
        @Query("offset") offset: Int,
        @Query("limit") limit: Int,
    ): FetchArtistsResponse

    @GET("artist/{id}/")
    suspend fun fetchArtistDetails(
        @Path("id") id: String,
        @Query("inc") inc: String = "recordings",
    ): ArtistResponse
}
