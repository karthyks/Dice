package com.karthyks.dice.search.repository

import com.karthyks.dice.search.mapper.SearchMapper
import com.karthyks.dice.search.models.ArtistCollection
import com.karthyks.dice.search.repository.SearchRepository.Companion.PAGE_SIZE
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

internal class SearchRepositoryImpl(
    private val dispatcher: CoroutineDispatcher,
    private val musicBrainzService: MusicBrainzService,
    private val searchMapper: SearchMapper,
) : SearchRepository {

    override suspend fun fetchArtists(
        searchTerm: String, offset: Int
    ): Result<ArtistCollection> = withContext(dispatcher) {
        musicBrainzService.fetchArtists(
            searchMapper.mapToSearchQuery(searchTerm, offset, PAGE_SIZE)
        ).mapCatching(searchMapper::mapArtistList)
    }
}