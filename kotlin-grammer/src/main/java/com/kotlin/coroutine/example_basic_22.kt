package com.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
/*
* 코틀린에서 이렇게 사용하면 안된다.
* */
fun main() = runBlocking {
    try {
        val time = measureTimeMillis {
            val one = somethingUsefulOneAsync()
            val two = somethingUsefulTwoAsync()

            println("myException")
            throw Exception("myException")
            runBlocking {
                println("The answer is ${one.await() + two.await()}")
            }
        }
        println("Completed in $time ms")
    } catch (e: Exception) {
    }

    runBlocking {
        delay(1000000)
    }
}
/*
* GlobalScope로 실행돼서
* 전역적으로 실행되기 때문에
* main함수가 끝나도 실행이 끝나지 않는다.
* */
fun somethingUsefulOneAsync() = GlobalScope.async {
    println("start, somethingUsefulOneAsync")
    val res = doSomethingUsefulOne()
    println("end, somethingUsefulOneAsync")
    res
}

fun somethingUsefulTwoAsync() = GlobalScope.async {
    println("start, somethingUsefulTwoAsync")
    val res = doSomethingUsefulTwo()
    println("end, somethingUsefulTwoAsync")
    res
}







