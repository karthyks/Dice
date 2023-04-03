package com.karthyks.dice.search.mapper

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.ArtistListEntity
import com.karthyks.dice.network.entities.ArtistQuery
import com.karthyks.dice.search.models.ArtistCollection
import com.karthyks.dice.search.models.ArtistItem

interface SearchMapper {
    fun mapArtistList(artistListEntity: ArtistListEntity): ArtistCollection
    fun mapToDomain(artistEntity: ArtistEntity): ArtistItem?
    fun mapToSearchQuery(searchTerm: String, offset: Int, limit: Int): ArtistQuery
}

internal class SearchMapperImpl : SearchMapper {

    override fun mapArtistList(artistListEntity: ArtistListEntity): ArtistCollection {
        return ArtistCollection(
            offset = artistListEntity.offset,
            artistItems = artistListEntity.artists.mapNotNull(::mapToDomain)
        )
    }

    override fun mapToDomain(artistEntity: ArtistEntity): ArtistItem? {
        val name = artistEntity.name ?: return null
        return ArtistItem(
            id = artistEntity.id,
            name = name,
            country = artistEntity.country ?: "???",
            isAlive = artistEntity.lifeSpan?.ended ?: false
        )
    }

    override fun mapToSearchQuery(searchTerm: String, offset: Int, limit: Int): ArtistQuery {
        return ArtistQuery(
            name = searchTerm,
            offset = offset,
            limit = limit
        )
    }
}
