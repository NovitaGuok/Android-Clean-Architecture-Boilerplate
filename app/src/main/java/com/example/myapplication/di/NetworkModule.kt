package com.example.myapplication.di

import com.example.myapplication.BuildConfig.BASE_URL
import com.example.myapplication.data.main.data_source.remote.service.MainService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
    }

    @Singleton
    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun providesRetrofitBuilder(): Retrofit.Builder {
        val contentType = "application/json".toMediaType()
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(Json.asConverterFactory(contentType))
    }

    @Singleton
    @Provides
    fun providesMainService(
        retrofitBuilder: Retrofit.Builder,
        okHttpClient: OkHttpClient
    ): MainService {
        return retrofitBuilder.client(okHttpClient).build().create(MainService::class.java)
    }
}