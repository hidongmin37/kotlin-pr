package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        /*
        * CoroutineStart.LAZY은
        * start()를 호출하거나 await()를 호출할 때는 비동기적으로 되고,
        * start()를 호출하지 않으면 동기적으로 동작한다.
        *
        * */
        val one = async (start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
        val two = async (start = CoroutineStart.LAZY){ doSomethingUsefulTwo() }
//        one.start()
//        two.start()

        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

