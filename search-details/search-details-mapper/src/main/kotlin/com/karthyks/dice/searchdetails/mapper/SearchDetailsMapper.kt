package com.karthyks.dice.searchdetails.mapper

import com.karthyks.dice.network.entities.ArtistEntity
import com.karthyks.dice.network.entities.RecordingEntity
import com.karthyks.dice.searchdetails.models.ArtistDetail
import com.karthyks.dice.searchdetails.models.Recording

interface SearchDetailsMapper {
    fun toDomainModel(artistEntity: ArtistEntity): ArtistDetail?
}

internal class SearchDetailsMapperImpl : SearchDetailsMapper {
    override fun toDomainModel(artistEntity: ArtistEntity): ArtistDetail? {
        val name = artistEntity.name ?: return null
        val id = artistEntity.id
        val country = artistEntity.country ?: "????"
        val isAlive = artistEntity.lifeSpan?.ended ?: false
        return ArtistDetail(
            id = id,
            name = name,
            country = country,
            isAlive = isAlive,
            recordings = artistEntity.recordings.orEmpty().mapNotNull { toRecordings(it) }
        )
    }

    private fun toRecordings(recordingEntity: RecordingEntity): Recording? {
        val title = recordingEntity.title ?: return null
        val id = recordingEntity.id
        return Recording(id = id, title = title)
    }
}