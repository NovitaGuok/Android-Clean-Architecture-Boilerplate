package com.example.myapplication.di

import com.example.myapplication.data.main.data_source.local.MainLocalDataSource
import com.example.myapplication.data.main.data_source.local.MainLocalDataSourceImpl
import com.example.myapplication.data.main.data_source.local.dao.MainDao
import com.example.myapplication.data.main.data_source.remote.MainRemoteDataSource
import com.example.myapplication.data.main.data_source.remote.MainRemoteDataSourceImpl
import com.example.myapplication.data.main.data_source.remote.service.MainService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {
    @Singleton
    @Provides
    fun providesMainRemoteDataSource(mainService: MainService): MainRemoteDataSource {
        return MainRemoteDataSourceImpl(mainService)
    }

    @Singleton
    @Provides
    fun providesMainLocalDataSource(mainDao: MainDao): MainLocalDataSource {
        return MainLocalDataSourceImpl(mainDao)
    }
}