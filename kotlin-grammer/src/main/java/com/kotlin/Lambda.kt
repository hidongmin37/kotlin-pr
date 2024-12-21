package com.kotlin

data class Hero(
    val name: String,
    val age: Int
)

val heroes = listOf(
    Hero("Captain", 44),
    Hero("Cyclops", 35),
    Hero("Wolverine", 45),
    Hero("Storm", 35),
    Hero("Jean Grey", 35)
)

fun main() {
    println(heroes.maxByOrNull { it.age })
    println(sumLambda(1, 2))
}

fun sum(x: Int, y: Int): Int = x + y

val sumLambda = { x: Int, y: Int -> x + y }


