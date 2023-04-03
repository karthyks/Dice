package com.karthyks.dice.searchdetails.mapper

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistLifeSpanEntity
import com.karthyks.dice.network.entities.RecordingEntity
import junit.framework.TestCase.*
import org.junit.Test

class SearchDetailsMapperTest {

    private val sut = SearchDetailsMapperImpl()

    @Test
    fun shouldMapToDomainModel() {
        val artistEntity = getArtistEntity("000", "fred")
        val result = sut.toDomainModel(artistEntity)
        assertNotNull(result)
        assertTrue(result!!.country == "????")
        assertTrue(result.id == artistEntity.id)
        assertTrue(result.name == artistEntity.name)
        assertFalse(result.isAlive)
        assertTrue(result.recordings.isEmpty())
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
