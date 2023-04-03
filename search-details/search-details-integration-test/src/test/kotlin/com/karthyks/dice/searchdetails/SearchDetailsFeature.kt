package com.karthyks.dice.searchdetails

import com.karthyks.dice.searchdetails.states.ArtistDetailScreenState
import com.karthyks.dice.testframework.BaseTest

class SearchDetailsFeature(
    private val viewModel: SearchDetailsViewModelDelegateImpl,
    private val onBaseTest: (BaseTest.() -> Unit) -> Unit,
) {
    fun perform(onViewModel: SearchDetailsViewModelDelegate.() -> Unit): SearchDetailsFeature {
        onViewModel(viewModel)
        return this
    }

    fun shouldBeLoadingState(): SearchDetailsFeature {
        onBaseTest {
            viewModel.screenState.waitForState { this is ArtistDetailScreenState.Loading }
        }
        return this
    }

    fun shouldBeLoaded(): SearchDetailsFeature {
        onBaseTest {
            viewModel.screenState.waitForState { this is ArtistDetailScreenState.ArtistDetailLoaded }
        }
        return this
    }

    fun shouldBeErrorState(): SearchDetailsFeature {
        onBaseTest {
            viewModel.screenState.waitForState {
                this is ArtistDetailScreenState.Error
            }
        }
        return this
    }
}