package com.karthyks.dice.app.test.di

import androidx.test.espresso.idling.CountingIdlingResource
import com.karthyks.dice.app.test.base.BaseInstrumentationTest.Companion.BACKGROUND_IDLER
import com.karthyks.dice.app.test.test.BuildConfig
import com.karthyks.dice.network.config.NetworkConfig
import com.karthyks.dice.network.di.ApiCallerDIModule
import com.karthyks.dice.network.helper.SafeApiCaller
import com.karthyks.dice.network.helper.SafeApiCallerImpl
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import dagger.multibindings.IntoSet
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object BuildConfigDIModule {
    @Provides
    @Singleton
    fun provideNetworkConfig(): NetworkConfig {
        return object : NetworkConfig {
            override val baseUrl: String = BuildConfig.BASE_WEB_URL
            override val userAgent: String = BuildConfig.USER_AGENT
        }
    }
}

@Module
@TestInstallIn(components = [SingletonComponent::class], replaces = [ApiCallerDIModule::class])
internal object SafeApiCallerModule {

    @Provides
    @Singleton
    fun provideApiCaller(
        moshi: Moshi,
        idlingResource: @JvmSuppressWildcards Set<CountingIdlingResource>,
    ): SafeApiCaller {
        return SafeApiCallerWrapper(
            safeApiCallerImpl = SafeApiCallerImpl(
                moshi
            ),
            idlingResource.first { it.name == BACKGROUND_IDLER }
        )
    }

    @Provides
    @IntoSet
    fun provideIdlingResource(): CountingIdlingResource {
        return CountingIdlingResource(BACKGROUND_IDLER)
    }
}
