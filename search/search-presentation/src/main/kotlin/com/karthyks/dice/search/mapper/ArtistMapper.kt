package com.karthyks.dice.search.mapper

import com.karthyks.dice.search.models.ArtistItem
import com.karthyks.dice.search.resource.ArtistStringProvider
import com.karthyks.dice.search.state.Artist

interface ArtistMapper {
    fun mapArtist(artistItem: ArtistItem): Artist
}

internal class ArtistMapperImpl(
    private val stringProvider: ArtistStringProvider,
) : ArtistMapper {
    override fun mapArtist(artistItem: ArtistItem): Artist {
        return Artist(
            name = artistItem.name,
            country = artistItem.country,
            id = artistItem.id,
            isAlive = if (artistItem.isAlive) stringProvider.getYes() else stringProvider.getNo()
        )
    }
}
