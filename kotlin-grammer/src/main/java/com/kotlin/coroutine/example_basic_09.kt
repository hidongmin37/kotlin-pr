package com.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            repeat(3) { i ->
                println("Coroutine A, $i")
                delay(100L)
            }
        }


        launch {
            repeat(5) { i ->
                println("Coroutine B, $i")
                delay(100L)

            }
        }

        println("Coroutine outer")
    }


}

fun <T> println(msg: T) {
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}
