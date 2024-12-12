package com.example.gitplusarchitecture.data.models

/**
 * User - data class for fetching and transform data from server
 */
data class User(
    val id: Int,
    val name: String,
    val login: String,
    val password: String,
    val isAdmin: Boolean
)
