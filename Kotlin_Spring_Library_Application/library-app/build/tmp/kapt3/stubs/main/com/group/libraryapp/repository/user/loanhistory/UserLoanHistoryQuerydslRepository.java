package com.group.libraryapp.repository.user.loanhistory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/group/libraryapp/repository/user/loanhistory/UserLoanHistoryQuerydslRepository;", "", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "findByBookName", "Lcom/group/libraryapp/domain/user/UserLoanHistory;", "bookName", "", "status", "Lcom/group/libraryapp/domain/user/UserLoanStatus;", "library-app"})
@org.springframework.stereotype.Component
public class UserLoanHistoryQuerydslRepository {
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    
    public UserLoanHistoryQuerydslRepository(@org.jetbrains.annotations.NotNull
    com.querydsl.jpa.impl.JPAQueryFactory queryFactory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public com.group.libraryapp.domain.user.UserLoanHistory findByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName, @org.jetbrains.annotations.Nullable
    com.group.libraryapp.domain.user.UserLoanStatus status) {
        return null;
    }
}