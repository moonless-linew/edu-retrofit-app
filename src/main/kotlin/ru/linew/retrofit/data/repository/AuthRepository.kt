package ru.linew.retrofit.data.repository

import io.reactivex.Single
import ru.linew.retrofit.data.api.AuthService
import ru.linew.retrofit.data.models.auth.Token
import ru.linew.retrofit.domain.repository.IAuthRepository
import ru.linew.retrofit.network.RetrofitClient

class AuthRepository: IAuthRepository {
    private val service = RetrofitClient.retrofit.create(AuthService::class.java)

    override fun getToken(): Single<Token> {
        return service.getToken()
    }
}