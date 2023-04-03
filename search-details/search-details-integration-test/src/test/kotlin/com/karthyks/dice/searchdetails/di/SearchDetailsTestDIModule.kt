package com.karthyks.dice.searchdetails.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [SearchDetailsBaseModule::class])
@InstallIn(SingletonComponent::class)
object SearchDetailsTestDIModule