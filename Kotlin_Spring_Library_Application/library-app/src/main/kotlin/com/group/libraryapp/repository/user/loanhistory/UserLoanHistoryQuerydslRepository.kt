package com.group.libraryapp.repository.user.loanhistory

import com.group.libraryapp.domain.user.QUserLoanHistory.userLoanHistory
import com.group.libraryapp.domain.user.UserLoanHistory
import com.group.libraryapp.domain.user.UserLoanStatus
import com.querydsl.core.QueryFactory
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Component

@Component
class UserLoanHistoryQuerydslRepository(
    private val queryFactory: JPAQueryFactory
) {

    fun findByBookName(bookName: String,status: UserLoanStatus? = null): UserLoanHistory? {
        return queryFactory.selectFrom(userLoanHistory)
            .where(
                userLoanHistory.bookName.eq(bookName),
                status?.let { userLoanHistory.status.eq(status) }
            )
            .limit(1)
            .fetchOne()
    }

}