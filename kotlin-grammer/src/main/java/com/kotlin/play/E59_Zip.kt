package com.kotlin.play

fun main() {

    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1
    val C = listOf("ㄱ", "ㄴ", "ㄷ")                     // 1

    val resultPairs = A zip B                      // 2
    val pairs = resultPairs zip C

    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3


    // (a,1,ㄱ) (b,2,ㄴ) (c,3,ㄷ) 나오게 하는 코드
    val resultPairs3 = A.zip(B).zip(C) { (a, b), c -> Triple(a, b, c) }
    println(resultPairs3)
    // triple을 쓰지 않고
    val resultPairs4 = A.zip(B).zip(C) { (a, b), c -> listOf(a, b, c) }
    println(resultPairs4)

    println(pairs)
    println("A zip B: $resultPairs")
    println("\$A\$B: $resultReduce")
}