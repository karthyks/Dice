package com.karthyks.dice.searchdetails

import androidx.lifecycle.ViewModel
import com.karthyks.dice.coroutines.annotation.Main
import com.karthyks.dice.searchdetails.mapper.ArtistStateMapper
import com.karthyks.dice.searchdetails.repository.SearchDetailsRepository
import com.karthyks.dice.searchdetails.states.ArtistDetailScreenState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.Closeable
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@HiltViewModel
class SearchDetailsViewModel @Inject constructor(
    searchDetailsViewModelDelegate: SearchDetailsViewModelDelegateImpl
) : ViewModel(), SearchDetailsViewModelDelegate by searchDetailsViewModelDelegate


interface SearchDetailsViewModelDelegate : Closeable {
    val screenState: StateFlow<ArtistDetailScreenState>
    fun onReady(artistID: String)
}

class SearchDetailsViewModelDelegateImpl @Inject constructor(
    @Main dispatcher: CoroutineDispatcher,
    private val searchDetailsRepository: SearchDetailsRepository,
    private val artistStateMapper: ArtistStateMapper,
) : SearchDetailsViewModelDelegate, CoroutineScope {
    override val coroutineContext: CoroutineContext = dispatcher + SupervisorJob()

    override val screenState: MutableStateFlow<ArtistDetailScreenState> = MutableStateFlow(
        ArtistDetailScreenState.Loading
    )

    override fun onReady(artistID: String) {
        launch {
            searchDetailsRepository.fetchArtistDetails(artistID)
                .onSuccess {
                    screenState.value = ArtistDetailScreenState.ArtistDetailLoaded(
                        artistStateMapper.mapToState(it)
                    )
                }
                .onFailure {
                    screenState.value = ArtistDetailScreenState.Error
                }
        }
    }

    override fun close() {
        coroutineContext.cancelChildren()
    }
}