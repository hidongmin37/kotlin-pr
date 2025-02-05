package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one =  doSomethingUsefulOne()
        val two =  doSomethingUsefulTwo()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")

}

suspend fun doSomethingUsefulOne(): Int {
    println("start, doSomethingUsefulOne")
    delay(1000L)
    println("end, doSomethingUsefulOne")
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("start, doSomethingUsefulTwo")
    delay(1000L)
    println("end, doSomethingUsefulTwo")
    return 29
}