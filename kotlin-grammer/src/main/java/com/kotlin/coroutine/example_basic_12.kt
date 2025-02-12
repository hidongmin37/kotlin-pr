package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        try {


            var nextPrintTime = startTime
            var i = 0
            while (i < 5) {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    /*
                    * delay가 없다면 5번 모두 찍히고, 있다면 도중에 중단됨.
                    * yield() 함수는 협조적 멀티태스킹을 위해 사용되는 함수로,
                    * 다른 코루틴에게 실행을 양보하고, 다시 실행될 때는 다른 코루틴이 실행되었던 지점부터 실행됨.
                    * */
                    yield() // 코루틴이 실행되는 동안 다른 코루틴이 실행될 수 있도록 함.
//                delay(1L) // 일시 중단에 협조적인 함수가 된 것임.
                    println("I'm sleeping ${i++} ...")
                    nextPrintTime += 500L
                }
            }
        } catch (e: CancellationException) {
            println("Exception: ${e}")
        }
    }

    delay(1300L)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 코루틴 중단
    println("main: Now I can quit.")
}