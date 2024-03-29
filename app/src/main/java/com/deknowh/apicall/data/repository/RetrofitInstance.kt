package com.deknowh.apicall.data.repository

import com.deknowh.apicall.data.remote.model.apiInterface.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance  {
    const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    val api: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }
}