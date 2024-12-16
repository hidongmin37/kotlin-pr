package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.*
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import com.group.libraryapp.util.fail
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest @Autowired constructor(
    private val userRepository: UserRepository,
    private val userService: UserService,
    private val userLoanHistoryRepository: UserLoanHistoryRepository
) {

    @AfterEach
    fun afterEach() {
        println("====== CLEAN 시작 ======")
        userRepository.deleteAll()
    }

    @Test
    fun saveUserTest() {
        // given
        val request = UserCreateRequest("장동민", null)


        //when
        userService.saveUser(request)

        //then
        val findAll = userRepository.findAll()
        assertThat(findAll).hasSize(1)

        val findByName = userRepository.findByName("장동민") ?: fail()
        assertThat(findByName.name).isEqualTo("장동민")
        assertThat(findAll[0].age).isNull()


    }

    @Test
    fun getUsersTest() {

        //given
        userRepository.saveAll(
            listOf(
                User("A", 23),
                User("B", null)
            )
        )

        // when
        val results = userService.getUsers()

        // then
        assertThat(results).hasSize(2)
        assertThat(results).extracting("name")
            .containsExactly("A", "B")

        assertThat(results).extracting("name").containsExactlyInAnyOrder(
            "A", "B"
        )

        assertThat(results).extracting("age").containsExactlyInAnyOrder(
            23, null
        )

    }

    @Test
    fun updateUserNameTest() {

        //given
        val savedUser = userRepository.save(User("a", null))
        val id = savedUser.id
        //when
        val userUpdateRequest = UserUpdateRequest(id!!, "asdf")
        userService.updateUserName(userUpdateRequest)

        //then
        val user = userRepository.findAll()[0]
        assertThat(user.name).isEqualTo("asdf")
    }

    @Test
    fun deleteUserTest() {
        //given
        userRepository.save(User("A", null))

        //when
        userService.deleteUser("A")
        // then
        assertThat(userRepository.findAll()).isEmpty()
    }

    @Test
    @DisplayName("대출 기록이 없는 유저도 응답에 포함된다")
    fun getUserLoanHistoriesTest() {
        // given
        userRepository.save(User("A", null))

        // when
        val results = userService.getUserLoanHistories()


        // then
        assertThat(results).hasSize(1)
        assertThat(results[0].name).isEqualTo("A")
        assertThat(results[0].books).isEmpty()
    }

    @Test
    @DisplayName("대출 기록이 많은 유저의 응답이 정상 동작한다")
    fun getUserLoanHistoriesTest2() {
        // given
        val userA = userRepository.save(User("A", null))
        userLoanHistoryRepository.saveAll(
            listOf(
                UserLoanHistory.fixture(
                    userA,
                    "이상한 나라의 앨리스"
                ),
                UserLoanHistory.fixture(
                    userA,
                    "어린왕자"
                ),
                UserLoanHistory.fixture(
                    userA,
                    "죄와 벌",
                    UserLoanStatus.RETURNED
                ),
                // 다른 책 2개 더

            )
        )

        //when
        val results = userService.getUserLoanHistories()

        // then
        assertThat(results).hasSize(1)
        assertThat(results[0].name).isEqualTo("A")
        assertThat(results[0].books).hasSize(3)
        assertThat(results[0].books).extracting("name")
            .containsExactlyInAnyOrder("이상한 나라의 앨리스", "어린왕자", "죄와 벌")
        assertThat(results[0].books).extracting("isReturn")
            .containsExactlyInAnyOrder(false, false, true)
    }





}