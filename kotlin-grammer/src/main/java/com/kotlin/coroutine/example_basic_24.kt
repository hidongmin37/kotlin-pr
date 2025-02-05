package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    try {
        val time = measureTimeMillis {
            println("The answer is ${somethingUsefulOneRightAsync()}")
        }
        println("Completed in $time ms")
    } catch (e: Exception) {
    }

    runBlocking {
        delay(1000000)
    }
}

suspend fun somethingUsefulOneRightAsync() = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }

    delay(10)
    println("Exception")
    throw Exception("Exception")

    one.await() + two.await()
}






