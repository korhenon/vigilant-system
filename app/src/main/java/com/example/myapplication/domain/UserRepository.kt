package com.example.myapplication.domain

import com.example.myapplication.data.UserService
import com.example.myapplication.data.models.User

class UserRepository {
    private val service = UserService()
    fun getCurrentUser(): User {
        return service.getCurrentUser()
    }

    fun getUsersTop(): List<User> {
        return service.getUserList().sortedBy { it.points }
    }
}