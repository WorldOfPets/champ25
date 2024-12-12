package com.example.gitplusarchitecture.domain.repository

import com.example.gitplusarchitecture.data.service.UserService


interface UserRepository {
    fun authorization()
    fun logOut()
    class Base() : UserRepository{
        override fun authorization() {
            val userService = UserService.Base()
            userService.fetchUser("evgen", "1234")
        }

        override fun logOut() {
            TODO("Not yet implemented")
        }
    }
}