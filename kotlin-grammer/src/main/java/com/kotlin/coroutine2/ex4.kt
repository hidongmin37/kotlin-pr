package com.kotlin.coroutine2
import kotlinx.coroutines.*


fun main3() = runBlocking {
    val job = launch (start = CoroutineStart.LAZY) {
        printWithThread("Hello launch")
    }

    delay(1_000L)
    job.start()
}

