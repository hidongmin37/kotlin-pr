package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserLoanHistoryRepository: JpaRepository<UserLoanHistory, Long> {
    fun findByBookNameAndReturned(bookName: String,returned: Boolean): UserLoanHistory?

}