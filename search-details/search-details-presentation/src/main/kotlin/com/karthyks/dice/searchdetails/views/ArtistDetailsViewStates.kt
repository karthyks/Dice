package com.karthyks.dice.searchdetails.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.karthyks.dice.compose.test.TestTag
import com.karthyks.dice.searchdetails.R
import com.karthyks.dice.searchdetails.states.ArtistState
import com.karthyks.dice.searchdetails.states.RecordingState

@Composable
fun ArtistDetails(artist: ArtistState) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.DarkGray)
                    .padding(16.dp)
                    .testTag(TestTag.searchDetailsScreen.nameTopBar)
                    .wrapContentSize(align = Alignment.CenterStart)
            ) {
                Text(
                    color = Color.White,
                    text = stringResource(R.string.artist_name, artist.name)
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .testTag(TestTag.searchDetailsScreen.recordingList),
            contentPadding = it,
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(artist.recordingStates) { rec ->
                RecordingItem(recordingState = rec)
            }
        }
    }
}

@Composable
fun RecordingItem(recordingState: RecordingState) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = recordingState.title
        )
    }
}