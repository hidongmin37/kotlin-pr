package com.kotlin.example

fun main() {
    heroes[0].let {
        println(it)
        println("첫번째 사람의 나이 : ${it.age}")
    }

    with(heroes[0]) {
        println(age)
        println(name)
    }

    heroes[0].apply {
        name = "jang"
        age = 23
    }

    with(heroes[0]) {
        println(age)
        println(name)
    }

    heroes.filter { it.age > 30 }.let {
        println("===")
        println(it)
        println("===")
    }

    heroes.also {
        if (it.size < 3) throw IllegalStateException("persons의 킉가 너무 작음")
        println("persons를 모두 완성했다 이젠 뭐하지?")
    }
    heroes.run {
        println(this.map { "${it.name}' age: ${it.age}" })
        println(this.map { "${it.name}의 나이는 ${it.age}살" })
    }
}