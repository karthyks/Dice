package com.karthyks.dice.searchdetails.mapper

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object SearchDetailsMapperModule {

    @Provides
    @Reusable
    fun provideSearchDetailsMapper(): SearchDetailsMapper {
        return SearchDetailsMapperImpl()
    }
}