package com.karthyks.dice.searchdetails.repository

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistLifeSpanEntity
import com.karthyks.dice.network.entities.RecordingEntity
import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper
import com.karthyks.dice.searchdetails.models.ArtistDetail
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class SearchRepositoryImplTest {

    private val dispatcher: CoroutineDispatcher = StandardTestDispatcher()
    private val musicBrainzService = mockk<MusicBrainzService>()
    private val searchDetailsMapper = mockk<SearchDetailsMapper>()
    private val sut: SearchDetailsRepositoryImpl = SearchDetailsRepositoryImpl(
        dispatcher,
        musicBrainzService,
        searchDetailsMapper
    )

    @Test
    fun shouldFetchArtistDetails() = runTest(dispatcher) {
        val artistID = "Fred"
        val artistEntity = getArtistEntity(id = "", name = artistID)
        val artistDetail = getArtistDetail(artistEntity.id, artistEntity.name!!)
        val result: Result<ArtistEntity> = Result.success(artistEntity)

        coEvery { musicBrainzService.fetchArtistDetails(artistID) } returns result
        every { searchDetailsMapper.toDomainModel(artistEntity) } returns artistDetail

        val details = sut.fetchArtistDetails(artistID).getOrNull()
        assertNotNull(details)
    }

    @Test
    fun shouldReturnFailure() = runTest(dispatcher) {
        val artistID = "Fred"
        val result: Result<ArtistEntity> = Result.failure(Exception("something"))

        coEvery { musicBrainzService.fetchArtistDetails(artistID) } returns result

        val details = sut.fetchArtistDetails(artistID)
        assertTrue(details.isFailure)
    }

    private fun getArtistEntity(id: String, name: String): ArtistEntity {
        return object : ArtistEntity {
            override val id: String = id
            override val name: String = name
            override val score: Int? = null
            override val gender: String? = null
            override val country: String? = null
            override val lifeSpan: ArtistLifeSpanEntity? = null
            override val recordings: List<RecordingEntity>? = null
        }
    }

    private fun getArtistDetail(id: String, name: String): ArtistDetail {
        return ArtistDetail(
            id = id,
            name = name,
            country = "",
            isAlive = false,
            recordings = emptyList()
        )
    }
}