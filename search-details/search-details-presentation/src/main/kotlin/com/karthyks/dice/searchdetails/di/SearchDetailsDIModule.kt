package com.karthyks.dice.searchdetails.di

import com.karthyks.dice.searchdetails.repository.SearchDetailsRepositoryProviderModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.migration.DisableInstallInCheck

@Module(includes = [SearchDetailsBaseModule::class])
@InstallIn(ViewModelComponent::class)
object SearchDetailsDIModule

@Module(
    includes = [
        ArtistStateMapperModule::class,
        SearchDetailsRepositoryProviderModule::class,
    ]
)
@DisableInstallInCheck
object SearchDetailsBaseModule