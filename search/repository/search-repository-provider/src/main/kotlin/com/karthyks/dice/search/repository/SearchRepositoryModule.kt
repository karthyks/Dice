package com.karthyks.dice.search.repository

import com.karthyks.dice.coroutines.annotation.IO
import com.karthyks.dice.search.mapper.SearchMapper
import com.karthyks.dice.search.mapper.SearchMapperModule
import com.karthyks.dice.service.musicbrainz.MusicBrainzService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck
import kotlinx.coroutines.CoroutineDispatcher

@Module(includes = [SearchMapperModule::class])
@DisableInstallInCheck
object SearchRepositoryModule {

    @Provides
    @Reusable
    fun provideSearchRepository(
        @IO dispatcher: CoroutineDispatcher,
        musicBrainzService: MusicBrainzService,
        searchMapper: SearchMapper,
    ): SearchRepository {
        return SearchRepositoryImpl(dispatcher, musicBrainzService, searchMapper)
    }
}
