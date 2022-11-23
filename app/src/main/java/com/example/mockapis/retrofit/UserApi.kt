package com.example.mockapis.retrofit


import com.example.mockapis.pojo.UserDetails
import retrofit2.Call
import retrofit2.http.GET

interface UserApi {

    @GET("userdetails")
    fun getUserDetails(): Call<UserDetails>
}