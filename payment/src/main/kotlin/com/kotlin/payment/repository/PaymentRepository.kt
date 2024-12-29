package com.kotlin.payment.repository

import com.kotlin.payment.domain.Order
import com.kotlin.payment.domain.OrderTransaction
import com.kotlin.payment.domain.PaymentUser
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentUserRepository : JpaRepository<PaymentUser, Long> {
    fun findByPayUserId(payUserId: String): PaymentUser?

}

interface OrderRepository : JpaRepository<Order, Long> {

}

interface OrderTransactionRepository : JpaRepository<OrderTransaction, Long> {

}