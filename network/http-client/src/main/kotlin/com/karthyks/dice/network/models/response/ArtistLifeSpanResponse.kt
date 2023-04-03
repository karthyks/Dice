package com.karthyks.dice.network.models.response

import com.karthyks.dice.network.entities.ArtistLifeSpanEntity
import com.squareup.moshi.Json

class ArtistLifeSpanResponse(
    @field:Json(name = "begin") override val begin: String?,
    @field:Json(name = "end") override val end: String?,
    @field:Json(name = "ended") override val ended: Boolean?
) : ArtistLifeSpanEntity