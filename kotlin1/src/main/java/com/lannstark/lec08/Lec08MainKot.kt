package com.lannstark.lec08

fun main() {
//    printNameAndGender(gender = "FEMALE", name = "장동민")

    val array = arrayOf("A","B","C")
    printAll(*array) // => 자바스크립트에서 *를 넣어서 해줌

}

fun max(a: Int, b: Int) = if (a > b) a else b // 코틀린에서는 if-else 바로 리턴가능

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1 .. num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}


fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}