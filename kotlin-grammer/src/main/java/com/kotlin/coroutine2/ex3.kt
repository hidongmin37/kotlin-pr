package com.kotlin.coroutine2
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield


fun main2() {
    runBlocking {
        printWithThread("START")
        launch {
            delay(2000)
            printWithThread("LAUNCH END")
        }
    }
    printWithThread("END")
}

