package ru.linew.retrofit.data.models.auth

data class Token(
    val access_token: String,
    val token_type: String,
    val expires_in: String
)