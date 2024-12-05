package com.group.libraryapp.domain.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "user_loan_history")
class UserLoanHistory(
    @ManyToOne
    var user: User,

    val bookName: String,

    var returned: Boolean,


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
) {

    fun doReturn() {
        this.returned = true
    }
}