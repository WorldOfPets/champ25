package com.example.gitplusarchitecture.data.service

import com.example.gitplusarchitecture.data.models.User


/**
 * UserService - interface for fetching data from server
 *
 * fetchUser - function for fetching user by login and password
 *
 * Date Created: 12.12.2024
 *
 * @author Evgenii Polivanov
 *
 */
interface UserService {
    /**
     * @param login - user login
     * @param password - user password
     * @return object User from server
     */
    fun fetchUser(login:String, password: String):User

    class Base() : UserService{
        override fun fetchUser(login: String, password: String): User {
            TODO("Not yet implemented")
        }

    }

}