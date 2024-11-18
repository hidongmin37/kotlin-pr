package com.lannstark.lec15

fun main() {

    val numbers = listOf(100, 200, 300)


    val emptyList = emptyList<Int>()

    printNumbers(emptyList()) // 타입 없어도 추론 가능 printNumbers(emptyList<Int>())
    printNumbers(numbers)


    val number2 = listOf(100, 200)

    println(number2.get(0))
    println(number2[0])
    for (number in number2) {
        println(number)
    }

    for((index, value) in number2.withIndex()) {
        println("${index}번째 값은 ${value}")
    }


    val number3 = mutableListOf(100, 200, 300)
    number3.add(400)
    println(number3)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[0] = "SUNDAY"
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    println(oldMap)

    val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")
    println(mapOf)

    for (key in oldMap.keys) {
        println("${key} : ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("${key} : ${value}")
    }


}

private fun printNumbers(numbers: List<Int>) {

}