package com.karthyks.dice.search.mapper

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object SearchMapperModule {

    @Provides
    @Reusable
    fun provideSearchMapper(): SearchMapper {
        return SearchMapperImpl()
    }
}