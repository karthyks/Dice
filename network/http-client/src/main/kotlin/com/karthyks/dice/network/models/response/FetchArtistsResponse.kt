package com.karthyks.dice.network.models.response

import com.karthyks.dice.network.entities.ArtistListEntity
import com.squareup.moshi.Json

data class FetchArtistsResponse(
    @field:Json(name = "offset") override val offset: Int,
    @field:Json(name = "artists") override val artists: List<ArtistResponse>
) : ArtistListEntity