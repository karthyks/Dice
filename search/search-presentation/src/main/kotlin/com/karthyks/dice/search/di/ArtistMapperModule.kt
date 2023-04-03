package com.karthyks.dice.search.di

import com.karthyks.dice.search.mapper.ArtistMapper
import com.karthyks.dice.search.mapper.ArtistMapperImpl
import com.karthyks.dice.search.resource.ArtistStringProvider
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object ArtistMapperModule {

    @Provides
    @Reusable
    fun provideArtistMapper(artistStringProvider: ArtistStringProvider): ArtistMapper {
        return ArtistMapperImpl(artistStringProvider)
    }
}
