package com.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {


        launch {  // 오타 수정
            delay(1000L)      // 1초 지연 후
            println("World!") // 출력
        }
        this.launch {  // 오타 수정
            delay(1000L)      // 1초 지연 후
            println("World!") // 출력
        }
        this.launch {  // 오타 수정
            delay(1000L)      // 1초 지연 후
            println("World!") // 출력
        }

        println("Hello, ")


    }
}