package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    /*
    * withTimeout을 사용하게 되면,
    * 지정한 시간이 지나면 코루틴을 중단시킬 수 있다.
    * */
    withTimeout(1000L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
}