package com.app.garant

import com.squareup.moshi.Moshi
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

data class AuthData(
    val phone: String
)

interface Api {

    @POST("auth/login")
    suspend fun login(@Body body: AuthData)

}

class ApiMda {
    fun apiLogin(phoneNum: String) = runBlocking {
        val loggingInterceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val moshi = Moshi.Builder().build()

        val moshiConverterFactory = MoshiConverterFactory.create(moshi)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://garant-mobile.usoftdev.uz/")
            .client(client)
            .addConverterFactory(moshiConverterFactory)
            .build()

        val api = retrofit.create(Api::class.java)
        val requestBody = AuthData(
            phone = phoneNum
        )

        val response = api.login(requestBody)

    }
}