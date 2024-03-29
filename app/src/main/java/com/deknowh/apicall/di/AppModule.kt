//package com.deknowh.apicall.di
//
//import android.provider.SyncStateContract.Constants
//import com.deknowh.apicall.data.remote.model.apiInterface.ApiInterface
//import com.deknowh.apicall.data.repository.FruitsRepository
//import com.google.android.datatransport.runtime.dagger.Module
//import com.google.android.datatransport.runtime.dagger.Provides
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object AppModule {
//    @Provides
//    @Singleton
//    fun provideApiService() : ApiInterface {
//        return Retrofit.Builder()
//            .baseUrl(com.deknowh.apicall.utils.Constants.BASE_URL)
////            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(ApiInterface::class.java)
//    }
//
//    @Provides
//    @Singleton
//    fun providesFruitsRepository(apiService: ApiInterface): FruitsRepository {
//        return FruitsRepository(apiService)
//    }
//}