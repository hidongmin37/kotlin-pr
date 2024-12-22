package com.kotlin.payment.domain

enum class OrderStatus {
    CREATED,
    FAILED,
    PAID,
    CANCELED,
    PARTIAL_REFUNDED,
    REFUNDED
}

enum class TransactionType {
    PAYMENT,
    REFUND,
    CANCEL
}

enum class TransactionStatus {
    RESERVE,
    SUCCESS,
    FAILURE
}