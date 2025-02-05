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
            withContext(
                NonCancellable
            ) {
                println("I'm running finally")
                /*
                * withContext를 사용하게 되면,
                * finally안에서 코루틴을 다시 불러와서
                * 코루틴을 실행시킬 수 있다.
                * */
                delay(1000L)
                println("And I've just delayed for 1 sec because I'm non-cancellable")
            }
        }

    }

    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 코루틴 중단 isActive를 사용하여 코루틴을 중단시킴.
    println("main: Now I can quit.")
}