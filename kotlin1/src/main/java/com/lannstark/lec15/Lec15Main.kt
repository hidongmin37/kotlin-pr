package com.lannstark.lec15

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i}번째 값은 ${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("${index}번째 값은 ${value}")
    }


    val newArray = array.plus(300)

    for (i in newArray.indices) {
        println("${i}번째 값은 ${newArray[i]}")
    }

    for ((index, value) in newArray.withIndex()) {
        println("${index}번째 값은 ${value}")
    }
}