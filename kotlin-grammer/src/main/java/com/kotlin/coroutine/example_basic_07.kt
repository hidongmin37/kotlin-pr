package com.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        printlnWorld()
    }

    println("Hello, ")
}

suspend fun printlnWorld() {
    delay(1000L)
    println("World.")
}