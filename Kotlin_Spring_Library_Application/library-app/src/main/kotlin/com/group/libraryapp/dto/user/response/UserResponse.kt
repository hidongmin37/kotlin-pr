package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User


// init 보다는 constructor를 사용하자
class UserResponse(
    val id: Long,
    val name: String,
    val age: Int?
) {
    companion object {
        fun of(user: User): UserResponse {
            return UserResponse(
                id = user.id!!,
                name = user.name,
                age = user.age
            )
        }
    }


//    constructor(user: User): this(
//        id = user.id!!,
//        name = user.name,
//        age = user.age
//    )

}
