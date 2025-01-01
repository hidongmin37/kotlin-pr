package com.kotlin.payment.service

import com.kotlin.payment.domain.*
import com.kotlin.payment.exception.ErrorCode
import com.kotlin.payment.exception.PaymentException
import com.kotlin.payment.repository.OrderRepository
import com.kotlin.payment.repository.OrderTransactionRepository
import com.kotlin.payment.repository.PaymentUserRepository
import com.kotlin.payment.util.generateOrderId
import com.kotlin.payment.util.generateTransactionId
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

/*
* 결제의 요청 저장, 성공,실패 저장
* */
@Service
class PaymentStatusService(
    private val paymentUserRepository: PaymentUserRepository,
    private val orderRepository: OrderRepository,
    private val orderTransactionRepository: OrderTransactionRepository,
) {

    @Transactional
    fun savePayRequest(
        payUserId: String,
        amount: Long,
        orderTitle: String,
        merchantTransactionId: String,
    ): Long {
        val paymentUser = paymentUserRepository.findByPayUserId(payUserId) ?: throw PaymentException(
            ErrorCode.INVALID_REQUEST,
            "사용자 없음 : $payUserId"
        )

        val order = orderRepository.save(
            Order(
                orderId = generateOrderId(),
                paymentUser = paymentUser,
                orderStatus = OrderStatus.CREATED,
                orderTitle = orderTitle,
                orderAmount = amount
            )
        )

        orderTransactionRepository.save(
            OrderTransaction(
                transactionId = generateTransactionId(),
                order = order,
                transactionType = TransactionType.PAYMENT,
                transactionStatus = TransactionStatus.RESERVE,
                transactionAmount = amount,
                merchantTransactionId = merchantTransactionId,
                description = orderTitle
            )
        )

        return order.id ?: throw PaymentException(ErrorCode.INTERVAL_SERVER_ERROR)
    }

    @Transactional
    fun saveAsSuccess(orderId: Long, payMethodTransactionId: String):
            Pair<String, LocalDateTime> {
        val order: Order = getOrderByOrderId(orderId)
            .apply {
                orderStatus = OrderStatus.PAID
                paidAmount = orderAmount
            }

        val orderTransaction =
            getOrderTransactionByOrder(order)
                .apply {
                    transactionStatus = TransactionStatus.SUCCESS
                    this.payMethodTransactionId = payMethodTransactionId
                    transactedAt = LocalDateTime.now()
                }

        return Pair(
            orderTransaction.transactionId,
            orderTransaction.transactedAt ?: throw PaymentException(ErrorCode.INTERVAL_SERVER_ERROR)
        )
    }

    fun saveAsFailure(orderId: Long, errorCode: ErrorCode) {
        val order: Order = getOrderByOrderId(orderId)
            .apply {
                orderStatus = OrderStatus.FAILED
                paidAmount = orderAmount
            }

        val orderTransaction = getOrderTransactionByOrder(order).apply {
            transactionStatus = TransactionStatus.FAILURE
            failureCode = errorCode.name
            description = errorCode.errorMessage
        }
    }

    private fun getOrderTransactionByOrder(order: Order) =
        orderTransactionRepository.findByOrderAndTransactionType(
            order = order,
            transactionType = TransactionType.PAYMENT
        ).first()

    private fun getOrderByOrderId(orderId: Long): Order = orderRepository.findById(orderId)
        .orElseThrow { throw PaymentException(ErrorCode.ORDER_NOT_FOUND) }
}