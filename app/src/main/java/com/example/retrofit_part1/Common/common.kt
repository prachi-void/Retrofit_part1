package com.example.retrofit_part1.Common

import com.example.retrofit_part1.Interface.RetrofitService
import com.example.retrofit_part1.Retrofit.RetrofitClient

object common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"

    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}