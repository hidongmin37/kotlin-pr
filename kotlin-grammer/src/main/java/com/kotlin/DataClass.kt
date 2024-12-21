package com.kotlin

data class DataUser(val userName: String, val age: Int)

class Knight(val grade: String)


fun main() {
    println(DataUser("User!", 24).toString())

}