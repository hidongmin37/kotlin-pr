package com.kotlin.coroutine2
import kotlinx.coroutines.*

/*
* async는 예외를 잡아내지 못한다.
* 하지만, runBlocking의 하위 코루틴에서 async를 사용했기 때문에,
* runBlocking이 예외를 잡아낸다.
*
* async에서 예외를 던지지 않게 하려면,
* supervisorJob을 사용하면 된다.
* */

fun main() {
    main6()
}

fun main4() = runBlocking {
    val job = async(SupervisorJob()) {
        throw IllegalArgumentException()
    }

    delay(1_000L)
}

fun main5() = runBlocking {
    val job = launch {
        try {
            throw IllegalArgumentException()
        } catch (e: IllegalArgumentException) {
           printWithThread("정상 종료")
        }
    }
}


/*
* 발생한 예외가 CancellationException이 아닌 경우,
* 취소로 간주하고 부모 코루틴에게 전파가 안된다.
*
* 그외 다른 예외가 발생한 경우,
* 실패로 간주하고 부모 코루틴에게 전파가 된다.
*
* */

fun main6() = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler { context, exception ->
        printWithThread("CoroutineExceptionHandler got $exception")
        printWithThread("CoroutineExceptionHandler got $context")
//        throw exception
    }

    val job = CoroutineScope(Dispatchers.Default).launch(exceptionHandler) {
        throw IllegalArgumentException()
    }

    delay(1_000L)
}


