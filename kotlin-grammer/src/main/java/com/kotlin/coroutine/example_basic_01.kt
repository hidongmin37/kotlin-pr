package com.kotlin.coroutine

import kotlin.concurrent.thread

fun main() {
//    GlobalScope.launch {  // 오타 수정
//        delay(1000L)      // 1초 지연 후
//        println("World!") // 출력
//    }

    thread {  // 오타 수정
        Thread.sleep(1000L)   // 1초 지연 후
        println("World!") // 출력
    }

    println("Hello, ")
    Thread.sleep(2000L)    // 메인 스레드 대기 (코루틴이 끝날 때까지)
}