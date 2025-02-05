package com.kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    GlobalScope.launch {  // 오타 수정
        delay(1000L)      // 1초 지연 후
        println("World!") // 출력
    }
    println("Hello, ")
    runBlocking {
        delay(2000L)
    }
}