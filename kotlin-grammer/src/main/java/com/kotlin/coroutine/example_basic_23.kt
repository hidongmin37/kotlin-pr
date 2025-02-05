package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
/*
* 코틀린에서 이렇게 사용하면 안된다.
* */
fun main() = runBlocking {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }

    println("Completed in $time ms")
}


suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne() }
    val two = async { doSomethingUsefulTwo() }
    one.await() + two.await()
}



