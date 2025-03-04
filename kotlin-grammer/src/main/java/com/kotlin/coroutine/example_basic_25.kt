package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main2() = runBlocking {
    try {
        val failedConcurrentSum = failedConcurrentSum()
        print("Result: $failedConcurrentSum")
    } catch (e: ArithmeticException) {
        println("Computation failed with ArithmeticException")
    }
}

suspend fun failedConcurrentSum() = coroutineScope {
    val one = async {
        try {
            delay(Long.MAX_VALUE) // Emulates very long computation
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}



