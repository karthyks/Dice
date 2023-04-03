package com.karthyks.dice.network.di.impl

import com.karthyks.dice.network.endpoint.MusicBrainzEndpoint
import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistListEntity
import com.karthyks.dice.network.entities.ArtistQuery
import com.karthyks.dice.network.helper.SafeApiCaller
import com.karthyks.dice.service.musicbrainz.MusicBrainzService

internal class MusicBrainzServiceImpl(
    private val safeApiCaller: SafeApiCaller,
    private val musicBrainzEndpoint: MusicBrainzEndpoint
) : MusicBrainzService {
    override suspend fun fetchArtists(
        query: ArtistQuery,
    ): Result<ArtistListEntity> {
        return safeApiCaller {
            musicBrainzEndpoint.fetchArtists(
                artist = query.artistName,
                offset = query.offset,
                limit = query.limit,
            )
        }
    }

    override suspend fun fetchArtistDetails(id: String): Result<ArtistEntity> {
        return safeApiCaller {
            musicBrainzEndpoint.fetchArtistDetails(id)
        }
    }
}
