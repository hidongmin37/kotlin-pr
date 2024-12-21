package com.kotlin

class Account {
    var balance: Long = 0
        private set(value) {
            if (value < 0) throw IllegalStateException("잔액은 0원 이상만 가능합니다.")

            field = value
        }

    var accountName: String = ""
        get() = "계좌이름:$field"

    fun increaseBalance(value: Int) {
        balance += value
    }

    fun decreaseBalance(value: Int) {
        if (this.balance - value < 0) {
            throw IllegalStateException("Balance cannot be under zero")
        }
        balance -= value
    }
}


fun main() {
    val account = Account()
//    account.balance = -7
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println("${account.accountName} 잔액 : ${account.balance}")
}