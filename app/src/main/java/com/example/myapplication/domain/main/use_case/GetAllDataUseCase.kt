package com.example.myapplication.domain.main.use_case

import com.example.myapplication.domain.main.model.Data
import com.example.myapplication.domain.main.repository.MainRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllDataUseCase @Inject constructor(private val mainRepository: MainRepository) {
    operator fun invoke(): Flow<List<Data>> {
        return mainRepository.getAllData()
    }
}