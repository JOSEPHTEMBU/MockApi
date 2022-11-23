package com.example.mockapis.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: UserApi by lazy {
            Retrofit.Builder()
            .baseUrl("https://628319bc-d8a7-40db-96bb-11815c3f2dc9.mock.pstmn.io/userdetails")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserApi::class.java)
    }
  }