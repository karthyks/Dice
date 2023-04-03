package com.karthyks.dice.network.models.response

import com.karthyks.dice.network.entities.RecordingEntity

class RecordingResponse(
    override val id: String,
    override val title: String?
) : RecordingEntity