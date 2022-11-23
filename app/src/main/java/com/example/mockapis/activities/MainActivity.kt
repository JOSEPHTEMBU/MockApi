package com.example.mockapis.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.mockapis.R
import com.example.mockapis.databinding.ActivityMainBinding
import com.example.mockapis.pojo.UserDetails
import com.example.mockapis.retrofit.RetrofitInstance
import com.google.android.material.bottomnavigation.BottomNavigationView
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

     RetrofitInstance.api.getUserDetails().enqueue(object:retrofit2.Callback<UserDetails>{
         override fun onResponse(
             call: retrofit2.Call<UserDetails>,
             response: Response<UserDetails>
         ) {
        if (response.body()! =null){

             }

         }

         override fun onFailure(call: retrofit2.Call<UserDetails>, t: Throwable) {


         }

     })
    }
}