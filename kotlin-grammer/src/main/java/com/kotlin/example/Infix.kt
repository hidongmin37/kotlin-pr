package com.kotlin.example


infix fun String.equalTo(expected: String) =
    this == expected

fun main() {
    val mapOfkey = mapOf("key" to "value", "k2" to "v2")

    println(mapOfkey)
//    val mutableMapOf = mutableMapOf<String, String>()
//    mutableMapOf.put("key", "value")

    println(mapOf("key".to("value"), "k2".to("k2")))
    println(mapOf(Pair("key", "value"), Pair("k2", "v2")))

    println("key" equalTo "value")
    println("key" equalTo "key")
}