package com.karthyks.dice.search.views

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.karthyks.dice.compose.test.TestTag
import com.karthyks.dice.search.R

@Composable
@Preview
internal fun SearchBar(
    modifier: Modifier = Modifier,
    searchField: String = "",
    onSearchTerm: (String) -> Unit = {},
) {
    val searchTerm = rememberSaveable { mutableStateOf(searchField) }
    val focusManager = LocalFocusManager.current
    OutlinedTextField(
        modifier = modifier.testTag(TestTag.searchScreen.searchField),
        value = searchTerm.value,
        onValueChange = { searchTerm.value = it },
        maxLines = 1,
        singleLine = true,
        placeholder = {
            Text(text = stringResource(id = R.string.search_hint), maxLines = 1)
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions {
            focusManager.clearFocus()
            onSearchTerm(searchTerm.value)
        }
    )
}
