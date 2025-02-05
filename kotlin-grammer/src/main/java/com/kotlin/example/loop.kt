package com.kotlin.example

fun evenOrOdd(n: Int) = when {
    n % 2 == 0 -> "$n even"
    else -> "$n odd"
}

fun main() {
    // 1~100까지(100포함)
    for (i in 1..100) {
        println(evenOrOdd(i))
    }

    // 100 ~ 1 까지(3 간격으로, 100, 97~1)
    for (i in 100 downTo 1 step 3) {
        println(evenOrOdd(i))
    }
}