package com.kotlin

fun String.double() = this + this + "hey"
fun String.double2(add:String) = this + this + add

fun double3(add:String) = add + add

fun Int.toString() = "$this"

infix fun String.addFront(frontString: String) = frontString +this

fun String.pany() = this.length

val String.getLastChar: Char
    get() = this[this.length - 1]


fun main() {
    println("do".double())

    println("hey".pany())

    println("hello".double2("hi"))

    println(double3("hey"))

    val lastChar = "jangdongmin".getLastChar
    println(lastChar)

    val maxOrNull = setOf(1, 23, 45, 4).maxOrNull()
    println(maxOrNull)

    println(listOf("ab","bc","cd").last())


    println("This is ver".addFront("ad"))

    // infix를 쓰면 아래와 같이 사용가능
    val s = "This is ver" addFront "Sdf"
    println(s)
}