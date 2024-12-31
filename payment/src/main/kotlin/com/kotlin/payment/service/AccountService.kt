package com.kotlin.payment.service

import com.kotlin.payment.adapter.AccountAdapter
import com.kotlin.payment.adapter.UseBalanceRequest
import com.kotlin.payment.domain.Order
import com.kotlin.payment.exception.ErrorCode
import com.kotlin.payment.exception.PaymentException
import com.kotlin.payment.repository.OrderRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class AccountService(
    private val accountAdapter: AccountAdapter,
    private val orderRepository: OrderRepository
) {

    @Transactional
    fun useAccount(orderId: Long): String {
        //계좌 사용 요청 및 처리
        val order: Order = orderRepository.findById(orderId)
            .orElseThrow { throw PaymentException(ErrorCode.ORDER_NOT_FOUND) }

        return accountAdapter.useAccount(
            UseBalanceRequest(
                userId = order.paymentUser.accountUserId,
                accountNumber = order.paymentUser.accountNumber,
                amount = order.orderAmount
            )
        ).transactionId
    }
}