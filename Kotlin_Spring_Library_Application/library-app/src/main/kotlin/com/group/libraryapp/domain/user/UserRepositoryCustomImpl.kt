package com.group.libraryapp.domain.user

import com.group.libraryapp.domain.user.QUser.user
import com.group.libraryapp.domain.user.QUserLoanHistory.userLoanHistory
import com.querydsl.jpa.impl.JPAQueryFactory

class UserRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory,

    ) : UserRepositoryCustom {


    override fun findAllWithHistories(): List<User> {
        return queryFactory.selectFrom(user)
            .distinct()
            .leftJoin(user.userLoanHistories, userLoanHistory)
            .fetchJoin()
            .fetch()
    }
}