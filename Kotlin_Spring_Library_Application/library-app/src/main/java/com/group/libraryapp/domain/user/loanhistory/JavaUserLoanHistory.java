//package com.group.libraryapp.domain.user.loanhistory;
//
//import com.group.libraryapp.domain.user.User;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//import static javax.persistence.GenerationType.IDENTITY;
//
//@Entity
//public class JavaUserLoanHistory {
//
//  @Id
//  @GeneratedValue(strategy = IDENTITY)
//  private Long id;
//
//  @ManyToOne
//  private User user;
//
//  private String bookName;
//
//  private boolean isReturn;
//
//  public JavaUserLoanHistory() {
//
//  }
//
//  public JavaUserLoanHistory(User user, String bookName, boolean isReturn) {
//    this.user = user;
//    this.bookName = bookName;
//    this.isReturn = isReturn;
//  }
//
//  public String getBookName() {
//    return this.bookName;
//  }
//
//  public User getUser() {
//    return this.user;
//  }
//
//  public boolean getReturn() {
//    return this.isReturn;
//  }
//
//  public void doReturn() {
//    this.isReturn = true;
//  }
//
//
//}
