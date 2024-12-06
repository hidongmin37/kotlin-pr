package com.group.libraryapp.service.book

import com.group.libraryapp.domain.book.Book
import com.group.libraryapp.domain.book.BookRepository
import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserLoanHistory
import com.group.libraryapp.domain.user.UserLoanHistoryRepository
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.book.request.BookLoanRequest
import com.group.libraryapp.dto.book.request.BookRequest
import com.group.libraryapp.dto.book.request.BookReturnRequest
import com.group.libraryapp.service.user.UserService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest @Autowired constructor(
    private val bookService: BookService,
    private val bookRepository: BookRepository,
    private val userRepository: UserRepository,
    private val userService: UserService,
    private val userLoanHistoryRepository: UserLoanHistoryRepository
) {


    @AfterEach
    fun afterEach() {
        bookRepository.deleteAll()
        userRepository.deleteAll()
    }

    @Test
    @DisplayName("책 등록이 정상 동작한다")
    fun saveBookTest() {
        //given
        val request = BookRequest("이상한 나라의 앨리스")

        // when
        bookService.saveBook(request)

        //then
        val books = bookRepository.findAll()
        assertThat(books).hasSize(1)
        assertThat(books[0].name).isEqualTo("이상한 나라의 앨리스")
    }

    @Test
    @DisplayName("책 대출이 정상 동작한다.")
    fun loanBookTest() {

        //given
        val book = Book("이상한 나라의 앨리스")
        bookRepository.save(book)

        val user = User("A",null) // user 생성
        userRepository.save(user)

        val request = BookLoanRequest(user.name, book.name)

        // when
        bookService.loanBook(request)

        // then
        val results = userLoanHistoryRepository.findAll()

        assertThat(results).hasSize(1)
        assertThat(results[0].bookName).isEqualTo(request.bookName)
        assertThat(results[0].user.id).isEqualTo(user.id)
        assertThat(results[0].returned).isEqualTo(false)
    }

    @Test
    @DisplayName("책이 진작 대출되어 있다면, 신규 대출이 실패한다")
    fun loanBookFailTest() {
        // given
        bookRepository.save(Book("이상한 나라의 앨리스"))
        val savedUser = userRepository.save(User("A", null))
        userLoanHistoryRepository.save(
            UserLoanHistory(
                savedUser,
                "이상한 나라의 앨리스",
                false
            )
        )
        val request = BookLoanRequest("A", "이상한 나라의 앨리스")

        // when & then
        val message = assertThrows<IllegalArgumentException> {
            bookService.loanBook(request)
        }.message

        assertThat(message).isEqualTo("진작 대출되어 있는 책입니다")

    }

    @Test
    @DisplayName("책 반납이 정상 동작한다")
    fun returnBookTest() {
        // given
        bookRepository.save(Book("이상한 나라의 앨리스"))
        val savedUser = userRepository.save(User("A", null))
        userLoanHistoryRepository.save(
            UserLoanHistory(
                savedUser,
                "이상한 나라의 앨리스",
                false
            )
        )
        val request = BookReturnRequest("A","이상한 나라의 앨리스")

        //when
        bookService.returnBook(request)

        //then
        val results = userLoanHistoryRepository.findAll()
        assertThat(results).hasSize(1)
        assertThat(results[0].returned).isEqualTo(true)

    }



}