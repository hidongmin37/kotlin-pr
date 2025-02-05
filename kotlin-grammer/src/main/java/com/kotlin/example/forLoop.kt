package com.kotlin.example

import java.util.TreeMap

fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((key, value) in binaryReps) {
        println("문자 : $key, 아스키코드 : $value")
    }
}


