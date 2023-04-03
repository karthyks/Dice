package com.karthyks.dice.search.di

import com.karthyks.dice.search.pager.di.DataSourceDIModule
import com.karthyks.dice.search.repository.SearchRepositoryModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.migration.DisableInstallInCheck

@Module(includes = [SearchBaseModule::class])
@InstallIn(ViewModelComponent::class)
object SearchDIModule

@Module(
    includes = [
        DataSourceDIModule::class,
        SearchRepositoryModule::class,
        ArtistMapperModule::class,
        ArtistStringProviderDIModule::class,
    ]
)
@DisableInstallInCheck
object SearchBaseModule