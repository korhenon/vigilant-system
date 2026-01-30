package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.data.models.User

class UserService {
    fun getCurrentUser(): User {
        return User(
            name = "Emil",
            avatar = R.drawable.img,
            points = 12
        )
    }

    fun getUserList(): List<User> {
        return listOf(
            User(
                name = "Vincent van Gogh",
                avatar = R.drawable.img_1,
                points = 13
            ),
            User(
                name = "Dmitri Ivanovich Mendeleev",
                avatar = R.drawable.img_2,
                points = 12
            ),
        )
    }
}