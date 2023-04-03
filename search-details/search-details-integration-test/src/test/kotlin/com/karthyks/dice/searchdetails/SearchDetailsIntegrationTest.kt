package com.karthyks.dice.searchdetails

import com.karthyks.dice.test.httpclient.ResponseBody
import com.karthyks.dice.testframework.BaseTest
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class SearchDetailsIntegrationTest : BaseTest() {

    @Inject
    lateinit var searchDetailsViewModelDelegate: SearchDetailsViewModelDelegateImpl

    private val onFeature: SearchDetailsFeature by lazy {
        SearchDetailsFeature(
            searchDetailsViewModelDelegate,
            onBaseTest = { with(this) { it() } }
        )
    }

    @Test
    fun shouldRenderSearchDetails() {
        mockServer.enqueue(10L, ResponseBody.Success.ArtistDetailSuccess)
        val artistID = "fred"
        onFeature
            .shouldBeLoadingState()
            .perform { onReady(artistID) }
            .shouldBeLoaded()
    }

    @Test
    fun shouldRenderError() {
        mockServer.setMockResponse(null, ResponseBody.Error)
        val artistID = "fred"
        onFeature
            .shouldBeLoadingState()
            .perform { onReady(artistID) }
            .shouldBeLoadingState()
            .shouldBeErrorState()
    }
}