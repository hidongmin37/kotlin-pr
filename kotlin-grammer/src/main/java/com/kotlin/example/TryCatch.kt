package com.kotlin.example

import javax.imageio.IIOException

fun main() {
    val str = "1"

    if (str.length > 10) {
        throw IllegalStateException("str$str is too long")
    }

    parse(str)
}

fun parse(numberStr: String): Int = try {
    Integer.parseInt(numberStr)
} catch (e: Exception) {
    throw IIOException("일부러 발생시키는 checked exception")
} finally {
    println("무조건 실행되는 코드 블록")
}

