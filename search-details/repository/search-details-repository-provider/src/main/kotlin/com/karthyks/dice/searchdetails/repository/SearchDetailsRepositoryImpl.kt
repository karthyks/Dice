package com.karthyks.dice.searchdetails.repository

import com.karthyks.dice.coroutines.annotation.IO
import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper
import com.karthyks.dice.searchdetails.models.ArtistDetail
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SearchDetailsRepositoryImpl @Inject constructor(
    @IO private val dispatcher: CoroutineDispatcher,
    private val musicBrainzService: MusicBrainzService,
    private val searchDetailsMapper: SearchDetailsMapper,
) : SearchDetailsRepository {

    override suspend fun fetchArtistDetails(
        artistID: String
    ): Result<ArtistDetail> = withContext(dispatcher) {
        musicBrainzService.fetchArtistDetails(artistID)
            .mapCatching(searchDetailsMapper::toDomainModel)
            .mapCatching { it ?: throw Exception("Invalid") }
    }
}
