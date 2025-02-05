package com.kotlin.example

val person2 = Pair("snow", true)

val persons = mapOf(
    "Snow" to true,
    "Peter" to false,
    "Paul" to true
)

fun main() {
    val (name, isMarried) = person2
    println("$name is $isMarried")

    persons.forEach { (name, isMarried) ->
        println("$name is married $isMarried")
    }

    // isMarried 미사용
    persons.forEach { (name, _) ->
        println("$name is in this list")
    }

}

