package com.kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main2() = runBlocking {
    GlobalScope.launch {
        repeat(100) {
            print("G")  // GlobalScope도 동시에 실행됨
            delay(100L)
        }
    }
}

fun main() {
    main2()
}
