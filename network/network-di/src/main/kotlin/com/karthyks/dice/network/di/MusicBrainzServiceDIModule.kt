package com.karthyks.dice.network.di

import com.karthyks.dice.network.di.impl.MusicBrainzServiceImpl
import com.karthyks.dice.network.endpoint.MusicBrainzEndpoint
import com.karthyks.dice.network.helper.SafeApiCaller
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MusicBrainzServiceDIModule {

    @Provides
    @Singleton
    fun provideMusicBrainzService(
        musicBrainzEndpoint: MusicBrainzEndpoint,
        safeApiCaller: SafeApiCaller,
    ): MusicBrainzService {
        return MusicBrainzServiceImpl(safeApiCaller, musicBrainzEndpoint)
    }

    @Provides
    @Singleton
    fun provideMusicBrainzEndpoint(retrofit: Retrofit): MusicBrainzEndpoint {
        return retrofit.create(MusicBrainzEndpoint::class.java)
    }
}
