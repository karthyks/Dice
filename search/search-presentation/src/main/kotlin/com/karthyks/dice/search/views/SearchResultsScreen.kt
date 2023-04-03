package com.karthyks.dice.search.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.karthyks.dice.compose.test.TestTag
import com.karthyks.dice.search.R
import com.karthyks.dice.search.state.SearchScreenState

@Composable
internal fun RenderEmptyState(
    onSearchTerm: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(align = Alignment.Center)
    ) {
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 16.dp),
            onSearchTerm = onSearchTerm
        )
    }
}

@Composable
internal fun RenderSearchResults(
    searchResultState: SearchScreenState.SearchResultState,
    onSearchTerm: (String) -> Unit,
    onArtistClick: (id: String) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Box(modifier = Modifier.padding(vertical = 8.dp)) {
                SearchBar(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(horizontal = 16.dp),
                    searchField = searchResultState.searchTerm,
                    onSearchTerm = onSearchTerm
                )
            }
        }
    ) {
        val artistData = searchResultState.artistPager.collectAsLazyPagingItems()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .testTag(TestTag.searchScreen.artistList),
            contentPadding = it
        ) {
            items(artistData) { curr ->
                curr?.let { artist ->
                    ArtistItem(artist = artist, onClick = onArtistClick)
                } ?: Text(text = stringResource(R.string.error_oops))
            }
            when (artistData.loadState.append) {
                is LoadState.Error -> {
                    item {
                        ArtistError {
                            artistData.retry()
                        }
                    }
                }
                LoadState.Loading -> {
                    item {
                        LoadingArtistItem()
                    }
                }
                is LoadState.NotLoading -> {
                    item {
                        Text(
                            modifier = Modifier.testTag(TestTag.searchScreen.pleaseWait),
                            text = stringResource(R.string.please_wait)
                        )
                    }
                }
                else -> Unit
            }
        }
    }
}
