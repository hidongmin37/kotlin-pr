package com.kotlin.example

val set = setOf(1, 2, 3)
val list = listOf("a", "b", "1L")
val map = mapOf(
    1 to "One",
    3 to "Three"
)

fun findMyName(
    firstName: String,
    lastName: String
): String = "$firstName $lastName"

fun findMyNameDefault(
    firstName: String = "dongmin2",
    lastName: String = "jang2"
): String = "$firstName $lastName"

fun main() {
    // 파라미터가 무엇인지 알 수 없어서 혼동이 될 수 있다(특히 파라미터가 많을 때)
    println(findMyName("dongmin", "jang"))
    println(findMyName(firstName = "dongmin", lastName = "jang"))
    println(findMyNameDefault())
    println(findMyNameDefault("do2", "rl"))

    val list1 = ArrayList<Int>() // 빈 ArrayList 생성
    list1.add(1)
    val list2 = mutableListOf(1, 2)
    list2.add(2)
    list2.add(2)
    list2.add(2)


    println(set)
    println(list)
    println(map)
    println(list1)
    println(list2)
}