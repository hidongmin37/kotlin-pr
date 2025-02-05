package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne2() }
        val two = async { doSomethingUsefulTwo2() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}
