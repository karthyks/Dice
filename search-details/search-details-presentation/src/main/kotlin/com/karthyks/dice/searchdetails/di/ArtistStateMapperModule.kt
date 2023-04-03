package com.karthyks.dice.searchdetails.di

import com.karthyks.dice.searchdetails.mapper.ArtistStateMapper
import com.karthyks.dice.searchdetails.mapper.ArtistStateMapperImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object ArtistStateMapperModule {

    @Provides
    @Reusable
    fun provideArtistStateMapper(): ArtistStateMapper = ArtistStateMapperImpl()
}