package com.kotlin.coroutine

import kotlinx.coroutines.*


fun main() = runBlocking {
  val request = launch {

      GlobalScope.launch {
            println("job1: I run in GlobalScope and execute independently!")
            delay(1000)
            println("job1: I am not affected by cancellation of the request")
      }

       val b = launch {
            delay(100)
            println("job2: I am a child of the request coroutine")
            delay(1000)
            println("job2: I will not execute this line if my parent request is cancelled")
      }

      println("request: I'm a request coroutine and I'm waiting")

  }

    delay(500)

    /*
    * GlobalScope.launch는 코루틴을 생성하고, 이 코루틴은 GlobalScope에 속해 있기 때문에
    * request.cancel() 함수를 호출해도 취소되지 않음.
    * 그리고 request.cancel() 함수를 호출하면 request 코루틴이 취소되고, request 코루틴이 생성한
    * */
    request.cancel()
    delay(1000)
    println("main: Who has survived request cancellation?")
}



