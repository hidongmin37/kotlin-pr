package com.kotlin.example

data class Hero(
    var name: String,
    var age: Int
)

val heroes = listOf(
    Hero("Captain", 44),
    Hero("Cyclops", 33),
    Hero("Wolverine", 45),
    Hero("Storm", 30),
    Hero("Jean Grey", 35)
)

fun main() {
    println(heroes.maxByOrNull { it.age })
    println(sumLambda(1, 2))
    println(heroes.filter { it.age > 36 })
    println(heroes
        .filter { it.age > 40 }
        .map { "${it.name}'s age is ${it.age}" }
    )

    val strings = listOf("abc", "def")
    println(strings.map { it.toList() })
    println(strings.map { it.toList() }.flatten())
    println(strings.flatMap { it.toList() })
}

fun sum(x: Int, y: Int): Int = x + y

val sumLambda = { x: Int, y: Int -> x + y }


