package com.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val job = launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }

    }

    delay(2000L)
    println("main: I'm tired of waiting!")
    job.cancel() // 코루틴 중단
    job.join()
    println("main: Now I can quit.")
}