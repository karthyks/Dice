package com.karthyks.dice.search.mapper

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistLifeSpanEntity
import com.karthyks.dice.network.entities.ArtistListEntity
import com.karthyks.dice.network.entities.RecordingEntity
import junit.framework.TestCase.*
import org.junit.Test

class SearchMapperTest {

    private val sut = SearchMapperImpl()


    @Test
    fun shouldMapToArtistCollection() {
        val artistListEntity = getArtistListEntity()
        val result = sut.mapArtistList(artistListEntity)
        val firstItem = result.artistItems.first()
        assertEquals(0, result.offset)
        assertEquals(1, result.artistItems.size)
        assertFalse(firstItem.isAlive)
        assertEquals("0", firstItem.id)
        assertEquals("fred", firstItem.name)
    }

    @Test
    fun shouldMapToSearchQuery() {
        val searchTerm = "fred"
        val limit = 25
        val result = sut.mapToSearchQuery(searchTerm, 0, limit)
        assertEquals(0, result.offset)
        assertEquals(limit, result.limit)
        assertEquals("artist:$searchTerm", result.artistName)
    }


    private fun getArtistListEntity(): ArtistListEntity {
        return object : ArtistListEntity {
            override val offset: Int = 0
            override val artists: List<ArtistEntity> = listOf(getArtistEntity("0", "fred"))
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
}