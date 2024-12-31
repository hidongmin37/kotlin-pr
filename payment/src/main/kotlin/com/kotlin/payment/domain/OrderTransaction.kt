package com.kotlin.payment.domain

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.ManyToOne
import java.time.LocalDateTime

@Entity
class OrderTransaction(
    val transactionId: String,
    @ManyToOne
    val order: Order,
    @Enumerated(EnumType.STRING)
    val transactionType: TransactionType, // 결제, 취소, 망취소
    @Enumerated(EnumType.STRING)
    var transactionStatus: TransactionStatus, // 생성, 성공, 실패

    val transactionAmount: Long,
    val merchantTransactionId: String,
    var payMethodTransactionId: String? = null,
    var transactedAt: LocalDateTime? = null,
    var failureCode: String? = null, // 실패될 때만 저장 됨.
    var description: String? = null,
) : BaseEntity() {
}