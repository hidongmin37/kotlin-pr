package com.kotlin.play

fun main(args: Array<String>) {

    val map = mapOf("키" to 42)
    val map2 = emptyMap<String, Int>()

    val value1 = map["키"]                                     // 1
    val value2 = map["키2"]                                    // 2

    val value3: Int = map.getValue("키")                       // 1
//    map.getValue("키2")                                        // NoSuchElementException
    val mapWithDefault = map.withDefault { k -> k.length }  //값이 없는경우에 길이 저장
    val value4 = mapWithDefault.getValue("키2")                // 3
    // "키2".length

    try {
        map.getValue("없는 키")                                 // 4
    } catch (e: NoSuchElementException) {
        println("메시지: $e")
    }


    println("value1 = $value1")
    println("value2 = $value2")
    println("value3 = $value3")
    println("value4 = $value4")
}