package com.kotlin.example

fun main() {


    val letter = isLetter('a')
    println(letter)
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "숫자"
    in 'a'..'Z' -> "알파벳"
    else -> "숫자도 알파벳도 아님"
}