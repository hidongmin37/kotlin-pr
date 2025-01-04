package com.kotlin.play

open class Tiger(val origin: String) {
    open fun sayHello() {
        println("${origin}의 타이거 왈: 어흥!")
    }
}

class SiberianTiger : Tiger("시베리아") {
    override fun sayHello() {
        // origin 프로퍼티 사용 가능
        println("${origin}의 시베리안 타이거는 더 크게 포효합니다: 어흐으으응!")
        // 또는 부모의 메서드도 함께 호출할 수 있습니다
        super.sayHello()
    }
}

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}