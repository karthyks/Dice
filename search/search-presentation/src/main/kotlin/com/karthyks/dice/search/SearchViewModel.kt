package com.karthyks.dice.search

import androidx.lifecycle.ViewModel
import androidx.paging.cachedIn
import androidx.paging.map
import com.karthyks.dice.coroutines.annotation.Main
import com.karthyks.dice.search.mapper.ArtistMapper
import com.karthyks.dice.search.pager.DataSourceFactory
import com.karthyks.dice.search.state.SearchScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import java.io.Closeable
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@HiltViewModel
class SearchViewModel @Inject constructor(
    searchViewModelDelegate: SearchViewModelDelegateImpl
) : ViewModel(), SearchViewModelDelegate by searchViewModelDelegate


interface SearchViewModelDelegate : Closeable {
    val screenState: StateFlow<SearchScreenState>
    fun onReady()
    fun fetchArtists(searchTerm: String)
}

class SearchViewModelDelegateImpl @Inject constructor(
    @Main coroutineDispatcher: CoroutineDispatcher,
    private val dataSourceFactory: DataSourceFactory,
    private val artistMapper: ArtistMapper,
) : SearchViewModelDelegate, Closeable, CoroutineScope {
    override val coroutineContext: CoroutineContext = coroutineDispatcher + SupervisorJob()

    override val screenState: MutableStateFlow<SearchScreenState> = MutableStateFlow(
        SearchScreenState.InitialState("")
    )

    private var searchJob: Job? = null

    override fun onReady() {
        // Do some startup work
    }

    override fun fetchArtists(searchTerm: String) {
        searchJob?.cancel()
        searchJob = launch {
            val artistPager = dataSourceFactory.create(searchTerm)
                .flow
                .map { it.map(artistMapper::mapArtist) }
                .cachedIn(this)
            screenState.value = SearchScreenState.SearchResultState(
                searchTerm, artistPager
            )
        }
    }

    override fun close() {
        coroutineContext.cancelChildren()
    }
}
