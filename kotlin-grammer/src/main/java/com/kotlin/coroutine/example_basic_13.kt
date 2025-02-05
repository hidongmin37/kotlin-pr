package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        try {

            var nextPrintTime = startTime
            var i = 0
            println("isActive: ${isActive}")
            while (isActive) {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    println("I'm sleeping ${i++} ...")
                    nextPrintTime += 500L
                }
            }
            println("isActive: ${isActive}")
        } catch (e: Exception) {
            /*
            isActive를 사용하여 코루틴을 중단시키면,
            CancellationException이 발생하지 않음.
            */
            println("Exception: ${e}")
        }

    }

    delay(1300L)
    println("main: I'm tired of waiting!")
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 코루틴 중단 isActive를 사용하여 코루틴을 중단시킴.
    println("main: Now I can quit.")
}