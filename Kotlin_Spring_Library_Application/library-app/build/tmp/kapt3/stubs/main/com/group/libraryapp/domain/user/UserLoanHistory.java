package com.group.libraryapp.domain.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001d\u001a\u00020\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006 "}, d2 = {"Lcom/group/libraryapp/domain/user/UserLoanHistory;", "", "user", "Lcom/group/libraryapp/domain/user/User;", "bookName", "", "status", "Lcom/group/libraryapp/domain/user/UserLoanStatus;", "id", "", "(Lcom/group/libraryapp/domain/user/User;Ljava/lang/String;Lcom/group/libraryapp/domain/user/UserLoanStatus;Ljava/lang/Long;)V", "getBookName", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "isReturn", "", "()Z", "getStatus", "()Lcom/group/libraryapp/domain/user/UserLoanStatus;", "setStatus", "(Lcom/group/libraryapp/domain/user/UserLoanStatus;)V", "getUser", "()Lcom/group/libraryapp/domain/user/User;", "setUser", "(Lcom/group/libraryapp/domain/user/User;)V", "doReturn", "", "Companion", "library-app"})
@javax.persistence.Table(name = "user_loan_history")
@javax.persistence.Entity
public final class UserLoanHistory {
    @org.jetbrains.annotations.NotNull
    @javax.persistence.ManyToOne
    private com.group.libraryapp.domain.user.User user;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String bookName = null;
    @org.jetbrains.annotations.NotNull
    private com.group.libraryapp.domain.user.UserLoanStatus status;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    public static final com.group.libraryapp.domain.user.UserLoanHistory.Companion Companion = null;
    
    public UserLoanHistory(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.User user, @org.jetbrains.annotations.NotNull
    java.lang.String bookName, @org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserLoanStatus status, @org.jetbrains.annotations.Nullable
    java.lang.Long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.group.libraryapp.domain.user.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBookName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.group.libraryapp.domain.user.UserLoanStatus getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserLoanStatus p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    public final boolean isReturn() {
        return false;
    }
    
    public final void doReturn() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/group/libraryapp/domain/user/UserLoanHistory$Companion;", "", "()V", "fixture", "Lcom/group/libraryapp/domain/user/UserLoanHistory;", "user", "Lcom/group/libraryapp/domain/user/User;", "bookName", "", "status", "Lcom/group/libraryapp/domain/user/UserLoanStatus;", "library-app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.group.libraryapp.domain.user.UserLoanHistory fixture(@org.jetbrains.annotations.NotNull
        com.group.libraryapp.domain.user.User user, @org.jetbrains.annotations.NotNull
        java.lang.String bookName, @org.jetbrains.annotations.NotNull
        com.group.libraryapp.domain.user.UserLoanStatus status) {
            return null;
        }
    }
}