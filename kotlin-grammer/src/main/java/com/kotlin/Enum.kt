package com.kotlin

fun main() {
    println("RED is ${getKoreanColorName(Color.RED)}")
    println("GREEN is ${getKoreanColorName(Color.GREEN)}")
    println("BLUE is ${getKoreanColorName(Color.BLUE)}")
    println("GRAY is ${getKoreanColorName(Color.GRAY)}")
}


enum class Color {
    RED,
    GREEN,
    BLUE,
    GRAY
}

fun getKoreanColorName(color: Color) =
    when (color) {
        Color.BLUE -> "파랑"
        Color.RED -> "빨강"
        Color.GREEN -> "녹색"
        Color.GRAY -> "회색"
    }