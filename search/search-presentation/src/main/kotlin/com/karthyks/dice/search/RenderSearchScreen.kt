package com.karthyks.dice.search

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.karthyks.dice.search.state.SearchScreenState
import com.karthyks.dice.search.views.RenderEmptyState
import com.karthyks.dice.search.views.RenderSearchResults

@Composable
fun RenderSearchScreen(
    viewModel: SearchViewModel = hiltViewModel(),
    onArtistClick: (String) -> Unit,
) {
    DisposableEffect(key1 = Unit) {
        viewModel.onReady()
        onDispose {
            viewModel.close()
        }
    }

    val screenState = viewModel.screenState.collectAsState()

    when (val state = screenState.value) {
        is SearchScreenState.InitialState -> {
            RenderEmptyState(onSearchTerm = viewModel::fetchArtists)
        }
        is SearchScreenState.SearchErrorState -> {
            Text(text = state.errorMessage)
        }
        is SearchScreenState.SearchResultState -> {
            RenderSearchResults(
                searchResultState = state,
                onSearchTerm = viewModel::fetchArtists,
                onArtistClick = onArtistClick
            )
        }
    }
}
