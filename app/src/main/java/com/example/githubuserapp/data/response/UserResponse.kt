package com.example.githubuserapp.data.response

import java.util.ArrayList

data class UserResponse(
    val login: String,
    val id: Int,
    val avatar_url: String,
    val items: ArrayList<User>
)
