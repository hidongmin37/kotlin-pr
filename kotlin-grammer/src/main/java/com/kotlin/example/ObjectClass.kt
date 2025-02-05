package com.kotlin.example

object ObjectFamily {
    val members = mutableListOf<Person>()
}

fun main() {
    ObjectFamily.members.add(Person("snow", true))
    println(ObjectFamily.members)
}