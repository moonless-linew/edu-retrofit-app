package ru.linew.retrofit.domain.repository

import io.reactivex.Single
import ru.linew.retrofit.data.models.auth.Token

interface IAuthRepository {
    fun getToken(): Single<Token>
}