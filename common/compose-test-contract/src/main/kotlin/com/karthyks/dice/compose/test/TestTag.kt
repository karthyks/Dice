package com.karthyks.dice.compose.test

object TestTag {
    val searchScreen = SearchScreen
    val searchDetailsScreen = SearchDetailsScreen

    object SearchScreen {
        private const val prefix = "search-"
        const val pleaseWait = "${prefix}pleaseWaitMessage"
        const val searchField = "${prefix}search-field"
        const val artistList = "${prefix}artist-list"
        const val error = "${prefix}error-message"
        const val artistItem = "${prefix}artist-item"
    }

    object SearchDetailsScreen {
        private const val prefix = "search-details-"
        const val errorMsg = "${prefix}error-message"
        const val loading = "${prefix}loading"
        const val closeBtn = "${prefix}closeBtn"
        const val recordingList = "${prefix}recordings"
        const val nameTopBar = "${prefix}nameTopBar"
    }
}