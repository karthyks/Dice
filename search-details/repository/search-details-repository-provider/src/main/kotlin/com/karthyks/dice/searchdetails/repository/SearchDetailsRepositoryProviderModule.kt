package com.karthyks.dice.searchdetails.repository

import com.karthyks.dice.coroutines.annotation.IO
import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapper
import com.karthyks.dice.searchdetails.mapper.SearchDetailsMapperModule
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck
import kotlinx.coroutines.CoroutineDispatcher

@Module(includes = [SearchDetailsMapperModule::class])
@DisableInstallInCheck
object SearchDetailsRepositoryProviderModule {

    @Provides
    @Reusable
    fun provideSearchDetailsRepository(
        @IO dispatcher: CoroutineDispatcher,
        musicBrainzService: MusicBrainzService,
        searchDetailsMapper: SearchDetailsMapper,
    ): SearchDetailsRepository {
        return SearchDetailsRepositoryImpl(dispatcher, musicBrainzService, searchDetailsMapper)
    }
}
