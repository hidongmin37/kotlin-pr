package com.kotlin.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {

    /*
    * withTimeoutOrNull을 사용하게 되면,
    * 지정한 시간이 지나면 코루틴을 중단시킬 수 있고,
    * 결과값을 반환하며
    * 예외를 발생시키지 않는다.
    * */
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
        "Done" // 타임아웃 없이 완료되면 이 값 반환, repeat를 줄인다면 타임아웃 시에 done을 반환할 수 있ㅇ음.

    }
    println("Result is $result") // 타임아웃 시에 null 반환

}