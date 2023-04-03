package com.karthyks.dice.search.state

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

sealed interface SearchScreenState {
    data class SearchResultState(
        val searchTerm: String,
        val artistPager: Flow<PagingData<Artist>>
    ) : SearchScreenState

    data class InitialState(val searchTerm: String) : SearchScreenState
    data class SearchErrorState(
        val searchTerm: String,
        val errorMessage: String
    ) : SearchScreenState
}

