package com.kotlin.coroutine2
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield


fun main1() = runBlocking {
    launch {
        repeat(5) {
            println("Coroutine A - $it")
            yield()  // 다른 코루틴에게 제어권 양보
        }
    }

    launch {
        repeat(5) {
            println("Coroutine B - $it")
            yield()  // 다른 코루틴에게 제어권 양보
        }
    }
}