package com.karthyks.dice.search.repository

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistLifeSpanEntity
import com.karthyks.dice.network.entities.ArtistListEntity
import com.karthyks.dice.network.entities.ArtistQuery
import com.karthyks.dice.network.entities.RecordingEntity
import com.karthyks.dice.search.mapper.SearchMapper
import com.karthyks.dice.search.models.ArtistCollection
import com.karthyks.dice.search.models.ArtistItem
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class SearchRepositoryImplTest {

    private val dispatcher = StandardTestDispatcher()
    private val musicBrainzService = mockk<MusicBrainzService>()
    private val mapper = mockk<SearchMapper>()

    private val sut = SearchRepositoryImpl(
        dispatcher,
        musicBrainzService,
        mapper
    )

    @Test
    fun shouldReturnSuccessResult() = runTest(dispatcher) {
        val searchTerm = "fred"
        val query = ArtistQuery(searchTerm, 0, SearchRepository.PAGE_SIZE)
        val artistEntity = getArtistEntity("0", "fred")
        val artistListEntity = getArtistListEntity(artistEntity)
        val artistCollection = getArtistCollection(artistEntity)
        every { mapper.mapToSearchQuery(searchTerm, 0, SearchRepository.PAGE_SIZE) } returns query
        coEvery { musicBrainzService.fetchArtists(query) } returns Result.success(artistListEntity)
        every { mapper.mapArtistList(artistListEntity) } returns artistCollection

        val result = sut.fetchArtists("fred", 0).getOrNull()
        val item = result!!.artistItems.first()

        assertNotNull(result)
        assertEquals(result == artistCollection)
        assertEquals(1, result.artistItems.size)
        assertEquals("0", item.id)
    }

    @Test
    fun shouldReturnError() = runTest(dispatcher) {
        val searchTerm = "fred"
        val query = ArtistQuery(searchTerm, 0, SearchRepository.PAGE_SIZE)
        every { mapper.mapToSearchQuery(searchTerm, 0, SearchRepository.PAGE_SIZE) } returns query
        coEvery { musicBrainzService.fetchArtists(query) } returns Result.failure(Exception("something"))

        val result = sut.fetchArtists("fred", 0)

        assertTrue(result.isFailure)
        verify(exactly = 0) { mapper.mapToDomain(any()) }
    }

    private fun getArtistListEntity(artistEntity: ArtistEntity): ArtistListEntity {
        return object : ArtistListEntity {
            override val offset: Int = 0
            override val artists: List<ArtistEntity> = listOf(artistEntity)
        }
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

    private fun getArtistCollection(artistEntity: ArtistEntity): ArtistCollection {
        return ArtistCollection(
            0, listOf(
                ArtistItem(
                    id = artistEntity.id,
                    name = artistEntity.name!!,
                    country = artistEntity.country.orEmpty(),
                    isAlive = false
                )
            )
        )
    }
}