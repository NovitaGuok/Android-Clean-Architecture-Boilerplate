package com.example.myapplication.di

import com.example.myapplication.data.main.data_source.local.MainLocalDataSource
import com.example.myapplication.data.main.data_source.remote.MainRemoteDataSource
import com.example.myapplication.data.main.repository.MainRepositoryImpl
import com.example.myapplication.domain.main.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun providesMainRepository(
        mainLocalDataSource: MainLocalDataSource,
        mainRemoteDataSource: MainRemoteDataSource
    ): MainRepository {
        return MainRepositoryImpl(mainLocalDataSource, mainRemoteDataSource)
    }
}