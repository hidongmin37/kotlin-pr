package com.kotlin.payment.adapter

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import java.time.LocalDateTime

@EnableFeignClients
@FeignClient(
    name = "account-adapter",
    url = "http://localhost:8080"
)
interface AccountAdapter {


    @PostMapping("/transaction/use")
    fun useAccount(
        @RequestBody useBalanceRequest: UseBalanceRequest
    ): UseBalanceResponse
}

data class UseBalanceResponse(
    var accountNumber: String,
    val transactionResult: TransactionResultType,
    val transactionId: String,
    val amount: Long,
    val transactedAt: LocalDateTime
)

enum class TransactionResultType {
    T, F
}

class UseBalanceRequest(
    val userId: Long,
    val accountNumber: String,
    val amount: Long
) {}