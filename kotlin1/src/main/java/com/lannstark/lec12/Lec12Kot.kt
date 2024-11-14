package com.lannstark.lec12


fun main() {
    println(Singleton.a)
    Singleton.a +=20
    println(Singleton.a)

}

class Person private constructor(
    var name: String,
    var age: Int,
){
    // 코틀린에는 static이라는게 없음, 동행 객체
    companion object Factory : Log {
        private const val MIN_AGE =1;

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 person class 동행 객체입니다")
        }
    }
}

object Singleton {
    var a: Int = 0

}