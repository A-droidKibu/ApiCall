//package com.deknowh.apicall.data.repository
//
//import android.content.res.Resources
//import com.deknowh.apicall.data.remote.model.apiInterface.ApiInterface
//import com.deknowh.apicall.data.remote.model.FruitResource
//import com.deknowh.apicall.utils.Resource
//
//class FruitsRepository(
//    private val apiService: ApiInterface
//) {
//    suspend fun getAllFruits(): Resource<List<FruitResource>> {
//        return try {
//            val response = apiService.getAllFruits()
//            Resource.Success(data = response)
//        } catch (e: Exception) {
//            Resource.Error(message = e.message?: "unknown Error Occurred!")
//        }
//    }
//}