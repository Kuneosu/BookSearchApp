package com.kks.booksearchapp.data.repository

import com.kks.booksearchapp.data.api.RetrofitInstance.api
import com.kks.booksearchapp.data.db.BookSearchDatabase
import com.kks.booksearchapp.data.model.Book
import com.kks.booksearchapp.data.model.SearchResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class BookSearchRepositoryImpl(
    private val db: BookSearchDatabase
) : BookSearchRepository {
    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return api.searchBooks(query, sort, page, size)
    }

    override suspend fun insertBook(book: Book) {
        db.bookSearchDao().insertBook(book)
    }

    override suspend fun deleteBook(book: Book) {
        db.bookSearchDao().deleteBook(book)
    }

    override fun getFavoriteBook(): Flow<List<Book>> {
        return db.bookSearchDao().getFavoriteBooks()
    }
}