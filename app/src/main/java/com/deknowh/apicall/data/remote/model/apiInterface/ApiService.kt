package com.deknowh.apicall.data.remote.model.apiInterface

import com.deknowh.apicall.data.Post
import retrofit2.http.GET

interface ApiService {
    @GET("/post")
    suspend fun getPosts() : List<Post>
}