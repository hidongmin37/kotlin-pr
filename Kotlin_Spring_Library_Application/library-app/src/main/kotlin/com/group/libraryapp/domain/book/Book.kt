package com.group.libraryapp.domain.book

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Book(
    val name: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? =null // 아직 초기화되지 않은 엔티티의 경우에는 null이 이 id에 할당됩니다.

) {

    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("책 이름은 공백일 수 없습니다.")
        }
    }

}