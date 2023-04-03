package com.karthyks.dice.service.musicbrainz

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistListEntity
import com.karthyks.dice.network.entities.ArtistQuery

interface MusicBrainzService {
    suspend fun fetchArtists(
        query: ArtistQuery,
    ): Result<ArtistListEntity>

    suspend fun fetchArtistDetails(id: String): Result<ArtistEntity>
}
