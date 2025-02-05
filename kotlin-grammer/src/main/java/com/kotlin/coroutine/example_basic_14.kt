package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
            println("I'm running finally")
        }

    }

    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 코루틴 중단 isActive를 사용하여 코루틴을 중단시킴.
    println("main: Now I can quit.")
}