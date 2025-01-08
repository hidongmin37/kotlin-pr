package com.kotlin.play

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSystemUser(newUser: Int) {                                 // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5
    println("전체 com.kotlin.play.getSudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach {                                     // 7
            i ->
        println("이용자 ${i}에 대한 정보")
    }
    // com.kotlin.play.getSysSudoers().com.kotlin.play.add(5) <- Error!                           // 8
}