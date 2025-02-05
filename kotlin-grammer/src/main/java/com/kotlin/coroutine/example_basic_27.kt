package com.kotlin.coroutine

import kotlinx.coroutines.*


fun main3() = runBlocking {
    println("My job is ${coroutineContext[Job]}")


    launch {
        println("My job is ${coroutineContext[Job]}")
    }

    async {
        println("My job is ${coroutineContext[Job]}")
    }
}



