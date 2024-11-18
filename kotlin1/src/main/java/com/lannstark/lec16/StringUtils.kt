package com.lannstark.lec16

fun main() {

    val str = "Hello, Kotlin"
    val lastChar = str.lastChar()
    println(lastChar)
    val str2 = "Hello, Java"
    val lastChar1 = str2.lastChar()
    println(lastChar1)

    val person = Person("동민","장", 100)
    person.nextYearAge()
}
fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}