package com.deknowh.apicall.data.remote.model.apiInterface

import retrofit2.http.GET

interface ApiInterface {
    @GET("api/fruits")
    suspend fun getAllFruits(): List<String>
}