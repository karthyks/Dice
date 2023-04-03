package com.karthyks.dice.search.resource

import android.content.Context
import com.karthyks.dice.search.R

interface ArtistStringProvider {
    fun getYes(): String
    fun getNo(): String
}

internal class ArtistStringProviderImpl(
    private val context: Context
) : ArtistStringProvider {
    override fun getNo(): String = context.getString(R.string.yes)

    override fun getYes(): String = context.getString(R.string.no)
}
