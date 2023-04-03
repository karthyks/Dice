package com.karthyks.dice.search.test

import com.karthyks.dice.search.SearchViewModelDelegateImpl
import com.karthyks.dice.testframework.BaseTest
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class SearchIntegrationTest : BaseTest() {

    @Inject
    lateinit var searchViewModelDelegate: SearchViewModelDelegateImpl

    private val onFeature: SearchFeature by lazy {
        SearchFeature(
            searchViewModelDelegate,
            onBaseTest = { with(this) { it() } }
        )
    }

    @Test
    fun shouldRenderSearchScreen() {
        onFeature
            .shouldBeInitialState()
            .perform { fetchArtists("fred") }
            .shouldBeResultState()
    }
}