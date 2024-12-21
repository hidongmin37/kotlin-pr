package com.kotlin

object ObjectFamily {
    val members = mutableListOf<Person>()
}

fun main() {
    ObjectFamily.members.add(Person("snow", true))
    println(ObjectFamily.members)
}