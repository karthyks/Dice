package com.karthyks.dice.search.pager

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.karthyks.dice.search.models.ArtistItem
import com.karthyks.dice.search.repository.SearchRepository
import com.karthyks.dice.search.repository.SearchRepository.Companion.PAGE_SIZE
import kotlinx.coroutines.delay

internal class ArtistPageDataSource(
    private val searchTerm: String,
    private val searchRepository: SearchRepository,
) : PagingSource<Int, ArtistItem>() {

    override fun getRefreshKey(state: PagingState<Int, ArtistItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ArtistItem> {
        val nextPageNumber = params.key ?: 0
        delay(DELAY_FETCH)
        return searchRepository.fetchArtists(
            searchTerm, nextPageNumber
        ).mapCatching {
            LoadResult.Page(
                data = it.artistItems,
                prevKey = null,
                nextKey = if (it.artistItems.size == PAGE_SIZE) it.offset + 1 else null
            )
        }.getOrElse {
            LoadResult.Error(it)
        }
    }

    private companion object {
        const val DELAY_FETCH = 2000L
    }
}
