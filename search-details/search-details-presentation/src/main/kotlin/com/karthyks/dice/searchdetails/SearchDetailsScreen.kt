package com.karthyks.dice.searchdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.karthyks.dice.compose.test.TestTag
import com.karthyks.dice.searchdetails.states.ArtistDetailScreenState
import com.karthyks.dice.searchdetails.views.ArtistDetails

@Composable
fun RenderSearchDetailsScreen(
    artistID: String,
    searchDetailsViewModel: SearchDetailsViewModel = hiltViewModel(key = artistID),
    onClose: () -> Unit,
) {
    DisposableEffect(key1 = Unit) {
        searchDetailsViewModel.onReady(artistID)
        onDispose {
            searchDetailsViewModel.close()
        }
    }

    val screenState = searchDetailsViewModel.screenState.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        when (val state = screenState.value) {
            is ArtistDetailScreenState.ArtistDetailLoaded -> {
                ArtistDetails(artist = state.artistDetail)
            }
            ArtistDetailScreenState.Error -> {
                Text(
                    modifier = Modifier.testTag(TestTag.searchDetailsScreen.errorMsg),
                    text = stringResource(R.string.oops_message)
                )
            }
            ArtistDetailScreenState.Loading -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .testTag(TestTag.searchDetailsScreen.loading)
                        .wrapContentSize(align = Alignment.Center)
                ) {
                    CircularProgressIndicator()
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .wrapContentSize(align = Alignment.TopEnd)
        ) {
            Image(
                modifier = Modifier
                    .size(24.dp)
                    .testTag(TestTag.searchDetailsScreen.closeBtn)
                    .clickable { onClose() },
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = "Close"
            )
        }
    }
}
