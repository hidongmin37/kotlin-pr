package com.kotlin.play

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("하나")                          // 2
        "Hello" -> println("인사")                      // 3
        is Long -> println("Long")
//        is MyClass2 -> println("MyClass2임")// 4
        !is String -> println("문자열 아님")           // 5
        else -> println("그 외")                      // 6
    }
}

class MyClass : MyClass2() {

}

open class MyClass2 {

}
