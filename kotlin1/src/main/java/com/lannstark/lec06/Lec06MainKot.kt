package com.lannstark.lec06

fun main1() {
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers) {
        println(number)
    }
}

fun main2() {
   for (i in 1 .. 3) {
       println(i)
   }
}

fun main3() {
   for(i in 3 downTo 1) {
       println(i)
   }
}

fun main4() {
    for(i in 1 .. 5 step 2) {
        println(i)
    }
}

fun main() {
    var i = 1

    while(i <= 3) {
        println(i)
        i++
    }
}