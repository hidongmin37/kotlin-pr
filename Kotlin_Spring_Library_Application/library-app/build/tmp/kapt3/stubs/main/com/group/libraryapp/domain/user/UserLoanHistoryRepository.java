package com.group.libraryapp.domain.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Lcom/group/libraryapp/domain/user/UserLoanHistoryRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/group/libraryapp/domain/user/UserLoanHistory;", "", "countByStatus", "status", "Lcom/group/libraryapp/domain/user/UserLoanStatus;", "findAllByStatus", "", "findByBookName", "bookName", "", "findByBookNameAndStatus", "library-app"})
public abstract interface UserLoanHistoryRepository extends org.springframework.data.jpa.repository.JpaRepository<com.group.libraryapp.domain.user.UserLoanHistory, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable
    public abstract com.group.libraryapp.domain.user.UserLoanHistory findByBookName(@org.jetbrains.annotations.NotNull
    java.lang.String bookName);
    
    @org.jetbrains.annotations.Nullable
    public abstract com.group.libraryapp.domain.user.UserLoanHistory findByBookNameAndStatus(@org.jetbrains.annotations.NotNull
    java.lang.String bookName, @org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserLoanStatus status);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.group.libraryapp.domain.user.UserLoanHistory> findAllByStatus(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserLoanStatus status);
    
    public abstract long countByStatus(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserLoanStatus status);
}