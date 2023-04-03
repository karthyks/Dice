package com.karthyks.dice.searchdetails.states

sealed interface ArtistDetailScreenState {
    data class ArtistDetailLoaded(val artistDetail: ArtistState) : ArtistDetailScreenState
    object Error : ArtistDetailScreenState
    object Loading : ArtistDetailScreenState
}

