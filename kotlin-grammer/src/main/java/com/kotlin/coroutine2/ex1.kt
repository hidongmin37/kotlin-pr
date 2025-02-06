package com.kotlin.coroutine2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield


/*
* runBlocking은
* 일반 루틴과 코루틴을 연결하고
*이 함수 자체로 새로운 코루틴을 만든다.
* */


/*
* launch는
* 반환값이 없는 코루틴을 만든다.
 */

/*
* suspend fun은 다른
* suspend fun을 호출할 수 있다.
* yield가 suspend fun이기 때문에 suspend로 호출한 것.
* */

fun main() = runBlocking{
    printWithThread("START")
    launch {
        newRoutine()
    }
    yield()
    printWithThread("END")
}

suspend fun newRoutine() {
    val num1 = 1
    val num2 = 2
    yield()
    printWithThread("${num1 + num2}")
}

fun printWithThread(str:Any) {
    println("Thread name: ${Thread.currentThread().name} $str")
}