package com.kks.booksearchapp.data.repository

import androidx.lifecycle.LiveData
import com.kks.booksearchapp.data.model.Book
import com.kks.booksearchapp.data.model.SearchResponse
import retrofit2.Response

interface BookSearchRepository {
    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int,
    ): Response<SearchResponse>


    // Room
    suspend fun insertBook(book: Book)

    suspend fun deleteBook(book: Book)

    fun getFavoriteBook(): LiveData<List<Book>>
}