package com.example.myapplication.di

import com.example.myapplication.domain.main.repository.MainRepository
import com.example.myapplication.domain.main.use_case.GetAllDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    fun providesMainUseCase(mainRepository: MainRepository): GetAllDataUseCase {
        return GetAllDataUseCase(mainRepository)
    }
}