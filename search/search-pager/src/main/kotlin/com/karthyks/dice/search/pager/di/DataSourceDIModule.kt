package com.karthyks.dice.search.pager.di

import com.karthyks.dice.search.pager.DataSourceFactory
import com.karthyks.dice.search.pager.DataSourceFactoryImpl
import com.karthyks.dice.search.repository.SearchRepository
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
object DataSourceDIModule {

    @Provides
    @Reusable
    fun provideDataSourceFactory(
        searchRepository: SearchRepository,
    ): DataSourceFactory {
        return DataSourceFactoryImpl(searchRepository)
    }
}
