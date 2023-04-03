package com.karthyks.dice.search.test.di

import com.karthyks.dice.search.di.SearchBaseModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [SearchBaseModule::class])
@InstallIn(SingletonComponent::class)
object SearchTestDIModule