package com.deknowh.apicall.viewmodel

import android.net.http.HttpException
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresExtension
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deknowh.apicall.data.Post
import com.deknowh.apicall.data.repository.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException


class MainViewModel: ViewModel() {
    private val apiService = RetrofitInstance.api
    val _posts: MutableStateFlow<List<Post>> = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> = _posts
    fun getPosts() {
        viewModelScope.launch {
            try {
                val response = apiService.getPosts()
                if (response.isNotEmpty()) {
                    _posts.value = response
                }
            } catch (e: Exception) {
                // some error
                when(e) {
                    is IOException -> {
                        // Network error occurred (no internet connection)
                        Log.e("Network Error", "No internet connection")
                    }
                    is HttpException -> {
                        // retrieve the status code
                        // handle http related error
                        val statusCode = e.hashCode()
                        val errorMessage = e.message
                        Log.e("HttpError", "HttpError: $statusCode message: $errorMessage")
                    }
                    else -> {
                        // prints other error on the logcat
                        Log.e("OtherError", "ERROR: ${e.message}", e)
                    }
                }
            }
        }
    }
}