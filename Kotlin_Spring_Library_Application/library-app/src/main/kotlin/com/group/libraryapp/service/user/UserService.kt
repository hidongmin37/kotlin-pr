package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import com.group.libraryapp.dto.user.response.UserResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val userRepository: UserRepository,
) {

    @Transactional
    fun saveUser(userRequest: UserCreateRequest) {
        val newUser = User(userRequest.name, userRequest.age)
        userRepository.save(newUser)
    }

    @Transactional(readOnly = true)
    fun getUsers(): List<UserResponse> {
        return userRepository.findAll().map {
//            user -> UserResponse(user)
            (::UserResponse)(it)
        }
    }

    @Transactional
    fun updateUserName(request: UserUpdateRequest){
        val user = userRepository.findById(request.id).orElseThrow(::IllegalArgumentException)
        user.updateName(request.name)
    }

    @Transactional
    fun deleteUser(name: String){
        val user = userRepository.findByName(name).orElseThrow(::IllegalArgumentException)
        userRepository.delete(user)
    }




}