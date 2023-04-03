package com.karthyks.dice.searchdetails.mapper

import com.karthyks.dice.searchdetails.models.ArtistDetail
import com.karthyks.dice.searchdetails.models.Recording
import com.karthyks.dice.searchdetails.states.ArtistState
import com.karthyks.dice.searchdetails.states.RecordingState

interface ArtistStateMapper {
    fun mapToState(artistDetail: ArtistDetail): ArtistState
}

internal class ArtistStateMapperImpl : ArtistStateMapper {
    override fun mapToState(artistDetail: ArtistDetail): ArtistState {
        return ArtistState(
            name = artistDetail.name,
            recordingStates = artistDetail.recordings.map(::mapToRecordingState)
        )
    }

    private fun mapToRecordingState(recording: Recording): RecordingState {
        return RecordingState(title = recording.title, id = recording.id)
    }
}
