package com.group.libraryapp.service.temp

import com.group.libraryapp.domain.user.UserLoanHistoryRepository
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.service.user.UserService
import com.group.libraryapp.util.TxHelper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.assertj.core.api.Assertions.assertThat
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
class TempTest @Autowired constructor(
    private val userService: UserService,
    private val userRepository: UserRepository,
    private val txHelper: TxHelper
) {

    @Autowired
    private lateinit var userLoanHistoryRepository: UserLoanHistoryRepository

    //    @Transactional // 영한쌤과 토비쌤은 권장
    @Test
    fun `유저 1명과 책 2권을 저장하고 대출한다`() {
        //when
        userService.saveUserAndLoanTwoBooks()

        //then
        val users = userRepository.findAll()
        assertThat(users).hasSize(1)
        assertThat(users[0].userLoanHistories).hasSize(2)
    }

    @Test
    fun `유저 1명과 책 2권을 저장하고 대출한다2`() {
        //when
        userService.saveUserAndLoanTwoBooks()

        //then
        val users = userRepository.findAll()
        assertThat(users).hasSize(1)
        assertThat(userLoanHistoryRepository.findAll()).hasSize(2)
    }

    @Test
    fun `유저 1명과 책 2권을 저장하고 대출한다3`() {
        //when
        userService.saveUserAndLoanTwoBooks()

        //then
        val users = userRepository.findAllWithHistories()
        assertThat(users).hasSize(1)
        assertThat(users[0].userLoanHistories).hasSize(2)
    }

    @Test
    fun `유저 1명과 책 2권을 저장하고 대출한다4`() {
        //when
        userService.saveUserAndLoanTwoBooks()

        //then
        // txhelper를 사용할 때는 트랜잭션을 이안에서 별도로 걸어줄 수 있음.
        txHelper.exec {
            val users = userRepository.findAll()
            assertThat(users).hasSize(1)
            assertThat(users[0].userLoanHistories).hasSize(2)
        }
    }


}