package com.karthyks.dice.network.models.response

import com.karthyks.dice.network.entities.ArtistEntity
import com.squareup.moshi.Json

class ArtistResponse(
    @field:Json(name = "id") override val id: String,
    @field:Json(name = "name") override val name: String?,
    @field:Json(name = "score") override val score: Int?,
    @field:Json(name = "gender") override val gender: String?,
    @field:Json(name = "country") override val country: String?,
    @field:Json(name = "life-span") override val lifeSpan: ArtistLifeSpanResponse?,
    @field:Json(name = "recordings") override val recordings: List<RecordingResponse>?
) : ArtistEntity