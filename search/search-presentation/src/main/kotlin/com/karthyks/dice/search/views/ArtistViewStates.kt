package com.karthyks.dice.search.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.karthyks.dice.compose.test.TestTag
import com.karthyks.dice.search.R
import com.karthyks.dice.search.state.Artist
import kotlinx.coroutines.delay

@Composable
internal fun LoadingArtistItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .wrapContentSize(align = Alignment.Center)
            .padding(8.dp)
    ) {
        CircularProgressIndicator()
    }
}

@Composable
internal fun ArtistItem(
    modifier: Modifier = Modifier,
    artist: Artist,
    onClick: (id: String) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag(TestTag.searchScreen.artistItem)
            .padding(8.dp)
            .clickable { onClick(artist.id) }
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = stringResource(R.string.artist_name, artist.name))
            Text(text = stringResource(id = R.string.artist_country, artist.country))
            Text(text = stringResource(id = R.string.artist_living, artist.isAlive))
        }
    }
}


@Composable
fun ArtistError(retry: () -> Unit) {
    LaunchedEffect(key1 = Unit) {
        delay(2000)
        retry()
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .testTag(TestTag.searchScreen.error)
            .wrapContentSize(align = Alignment.Center)
            .padding(8.dp)
    ) {
        Text(text = stringResource(R.string.error_retrying))
    }
}
