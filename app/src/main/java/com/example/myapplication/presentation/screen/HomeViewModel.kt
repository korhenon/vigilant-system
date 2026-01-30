package com.example.myapplication.presentation.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.models.User
import com.example.myapplication.domain.UserRepository

class HomeViewModel : ViewModel() {
    // Это можно и не делать просто для красоты делаемы установку значения private
    private var _currentUser by mutableStateOf<User?>(null)
    private var _usersTop by mutableStateOf<List<User>>(listOf())
    private val repository = UserRepository()


    val currentUser get() = _currentUser
    val usersTop get() = _usersTop

    fun loadInfo() {
        _currentUser = repository.getCurrentUser()
        _usersTop = repository.getUsersTop()
    }
}