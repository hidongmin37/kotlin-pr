package com.kotlin.play

fun main() {

    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // 1
    println(list.getOrElse(10) { it * 2 })   // 2
}