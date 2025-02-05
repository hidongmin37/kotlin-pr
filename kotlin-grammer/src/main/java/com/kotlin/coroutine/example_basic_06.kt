package com.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(100) {
        launch {
            print(".")
            delay(1000L)
        } // 코루틴이 스레드 보다 훨씬 가벼움
    }
}
