package com.captechventures.darktheme.model

data class User(
    val firstName: String,
    val lastName: String,
    val message: String,
    val isRead: Boolean,
    val date: String,
    val resId: Int
)