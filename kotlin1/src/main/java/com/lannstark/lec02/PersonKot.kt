package com.lannstark.lec02

fun main() {
    val person = Person("개발하는 공부자")

    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}
