package com.kotlin.play

fun main() {
    class User(val map: MutableMap<String, Any?>) {
        var name: String by map                // 1
        var age: Int by map                // 1
    }

    val user = User(
        mutableMapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
    user.name = "Jane Doe"
    println("name = ${user.name}, age = ${user.age}")
}