package com.karthyks.dice.search.di

import android.content.Context
import com.karthyks.dice.search.resource.ArtistStringProvider
import com.karthyks.dice.search.resource.ArtistStringProviderImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object ArtistStringProviderDIModule {

    @Provides
    @Reusable
    fun provideArtistStringProvider(@ApplicationContext context: Context): ArtistStringProvider {
        return ArtistStringProviderImpl(context)
    }
}