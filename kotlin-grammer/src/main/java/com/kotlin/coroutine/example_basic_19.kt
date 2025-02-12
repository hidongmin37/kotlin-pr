package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one =  doSomethingUsefulOne2()
        val two =  doSomethingUsefulTwo2()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}

 fun doSomethingUsefulOne2(): Int {
     runBlocking {
         delay(1000L)
         println("doSomethingUsefulOne")
     }
    return 13
}

 fun doSomethingUsefulTwo2(): Int {
     runBlocking {
         delay(1000L)
            println("doSomethingUsefulTwo")
     }
    return 29
}