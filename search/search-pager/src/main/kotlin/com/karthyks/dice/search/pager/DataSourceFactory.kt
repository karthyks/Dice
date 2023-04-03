package com.karthyks.dice.search.pager

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.karthyks.dice.search.models.ArtistItem
import com.karthyks.dice.search.repository.SearchRepository

interface DataSourceFactory {
    fun create(searchTerm: String): Pager<Int, ArtistItem>
}

internal class DataSourceFactoryImpl(
    private val searchRepository: SearchRepository,
) : DataSourceFactory {
    override fun create(searchTerm: String): Pager<Int, ArtistItem> {
        return Pager(PagingConfig(pageSize = SearchRepository.PAGE_SIZE)) {
            ArtistPageDataSource(searchTerm, searchRepository)
        }
    }
}
