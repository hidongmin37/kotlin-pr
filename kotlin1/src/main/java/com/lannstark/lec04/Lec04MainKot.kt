package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1

    if (money1 > money2) {
        println("Money1이 Money2 보다 금액이 큽니다")
    }

    println(money1 == money2)
    println(money1 === money2)
    println(money1 == money3)
    println(money1 === money3)

    if (fun2() || fun1()) {
        println("통과")
    }

    println(money1 + money2)
}


fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return true
}