package com.kotlin

class User(val userName: String)

class User2 constructor(_userName: String) {
    val userName: String

    init {
        userName = _userName
    }
}

class User3 (_userName: String) {
    val userName: String = _userName
}

val userName = User("Zero").userName

data class User4(val userName: String = "defaultName")

val user4Name = User4().userName
val user4Name2 = User4("asdf").userName