package com.example.myapplication.domain.main.repository

import com.example.myapplication.domain.main.model.Data
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    fun getAllData(): Flow<List<Data>>
}