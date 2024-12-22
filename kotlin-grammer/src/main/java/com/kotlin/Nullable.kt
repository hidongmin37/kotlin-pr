package com.kotlin

fun main() {
    val nullablePerson: Hero? =
        if (System.currentTimeMillis() % 2 == 0L) Hero("Even", 23)
        else null

    if (nullablePerson != null) {
        println("짝수 시간에만 존재하는 사람의 나이는: ${nullablePerson.age}")
    }

    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson?.age ?: Person("asdf", true)}")

    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson!!.age}")
}