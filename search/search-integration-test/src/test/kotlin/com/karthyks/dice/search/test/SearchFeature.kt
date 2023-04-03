package com.karthyks.dice.search.test

import com.karthyks.dice.search.SearchViewModelDelegate
import com.karthyks.dice.search.SearchViewModelDelegateImpl
import com.karthyks.dice.search.state.SearchScreenState
import com.karthyks.dice.testframework.BaseTest

class SearchFeature(
    private val viewModel: SearchViewModelDelegateImpl,
    private val onBaseTest: (BaseTest.() -> Unit) -> Unit,
) {
    fun perform(onViewModel: SearchViewModelDelegate.() -> Unit): SearchFeature {
        onViewModel(viewModel)
        return this
    }

    fun shouldBeInitialState(): SearchFeature {
        onBaseTest {
            viewModel.screenState.waitForState { this is SearchScreenState.InitialState }
        }
        return this
    }

    fun shouldBeResultState(): SearchFeature {
        onBaseTest {
            viewModel.screenState.waitForState {
                this is SearchScreenState.SearchResultState
            }
        }
        return this
    }
}