package com.group.libraryapp.domain.user

import javax.persistence.*


@Entity
class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    var name: String,

    val age: Int?,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL],orphanRemoval = true)
    val userLoanHistories: List<UserLoanHistory> = mutableListOf()
) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("이름은 비어 있을 수 없습니다.")
        }
    }

    fun updateName(name: String) {
       this.name = name
    }
}