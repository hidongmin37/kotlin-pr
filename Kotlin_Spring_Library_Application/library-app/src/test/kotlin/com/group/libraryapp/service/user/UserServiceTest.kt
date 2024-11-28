package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest @Autowired constructor(
     private val userRepository: UserRepository,
    private val userService: UserService
) {

    @AfterEach
    fun afterEach() {
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

        val findByName = userRepository.findByName("장동민")
        assertThat(findByName.get().name).isEqualTo("장동민")
        assertThat(findAll[0].age).isNull()


    }

    @Test
    fun getUsersTest() {

        //given
        userRepository.saveAll(listOf(
            User("A",23),
            User("B",null)
        ))

        // when
        val results = userService.getUsers()

        // then
        assertThat(results).hasSize(2)
        assertThat(results).extracting("name")
            .containsExactly("A","B")

        assertThat(results).extracting("name").containsExactlyInAnyOrder(
            "A","B"
        )

        assertThat(results).extracting("age").containsExactlyInAnyOrder(
            23,null
        )

    }

    @Test
    fun updateUserNameTest() {

        //given
        val savedUser = userRepository.save(User("a", null))
        val id = savedUser.id
        //when
        val userUpdateRequest = UserUpdateRequest(id, "asdf")
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
}