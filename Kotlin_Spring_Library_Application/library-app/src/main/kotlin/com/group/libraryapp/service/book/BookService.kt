package com.group.libraryapp.service.book

import com.group.libraryapp.domain.book.Book
import com.group.libraryapp.domain.book.BookRepository
import com.group.libraryapp.domain.user.UserLoanHistoryRepository
import com.group.libraryapp.domain.user.UserLoanStatus
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.book.request.BookLoanRequest
import com.group.libraryapp.dto.book.request.BookRequest
import com.group.libraryapp.dto.book.request.BookReturnRequest
import com.group.libraryapp.dto.book.response.BookStatResponse
import com.group.libraryapp.repository.book.BookQuerydslRepository
import com.group.libraryapp.util.fail
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BookService(
    private val bookRepository: BookRepository,
    private val userRepository: UserRepository,
    private val bookQuerydslRepository: BookQuerydslRepository,
    private val userLoanHistoryRepository: UserLoanHistoryRepository
    ) {

    @Transactional
    fun saveBook(bookRequest: BookRequest) {
        val newBook = Book(bookRequest.name, bookRequest.type)
        bookRepository.save(newBook)
    }

    @Transactional
    fun loanBook(request: BookLoanRequest) {
        val book = bookRepository.findByName(request.bookName) ?: fail()
        if (userLoanHistoryRepository.findByBookNameAndStatus(request.bookName, UserLoanStatus.LOANED) != null) {
            throw IllegalArgumentException("이미 대출되어 있는 책입니다.")
        }
        val user = userRepository.findByName(request.userName) ?: fail()
        user.loanBook(book)
    }

    @Transactional
    fun returnBook(request: BookReturnRequest) {
        val user = userRepository.findByName(request.userName) ?: fail()
        user.returnBook(request.bookName)
    }

    @Transactional(readOnly = true)
    fun countLoanedBook(): Int {
        return userLoanHistoryRepository.countByStatus(UserLoanStatus.LOANED).toInt()
    }

    @Transactional(readOnly = true)
    fun getBookStatistics(): List<BookStatResponse> {

//        return bookRepository.getStats()
        return bookQuerydslRepository.getStats()
//        return bookRepository.findAll().groupBy { book -> book.type } // Map<BookType,List<Book>>
//            .map { (type,books) -> BookStatResponse(type, books.size)} // List<BookStatResponse>

//        val results = mutableListOf<BookStatResponse>()
//        val books = bookRepository.findAll()
//        for (book in books){
//            results.firstOrNull { dto -> dto.type == book.type }?.plusOne()
//                ?: results.add(BookStatResponse(book.type, 1))
//        }
//        return results


    }

}