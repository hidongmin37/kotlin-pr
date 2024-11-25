package com.lannstark.lec04

data class Money (
    val amount: Long
) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

    operator fun minus(other: Money): Money {
        return Money(this.amount - other.amount - 100)
    }

    operator fun compareTo(other: Money): Int {
        return (this.amount - other.amount-100).toInt()
    }
}
