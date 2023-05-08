package ru.linew.retrofit.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val client: OkHttpClient = OkHttpClient
        .Builder()
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.spotify.com/v1/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
}