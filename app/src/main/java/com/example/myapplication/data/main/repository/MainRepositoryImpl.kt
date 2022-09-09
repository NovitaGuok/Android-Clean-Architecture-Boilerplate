package com.example.myapplication.data.main.repository

import com.example.myapplication.data.main.data_source.local.MainLocalDataSource
import com.example.myapplication.data.main.data_source.local.entity.toData
import com.example.myapplication.data.main.data_source.remote.MainRemoteDataSource
import com.example.myapplication.data.main.data_source.remote.dto.toData
import com.example.myapplication.domain.main.model.Data
import com.example.myapplication.domain.main.model.toEntity
import com.example.myapplication.domain.main.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainLocalDataSource: MainLocalDataSource,
    private val mainRemoteDataSource: MainRemoteDataSource,
) :
    MainRepository {
    override fun getAllData(): Flow<List<Data>> {
        return flow {
            val data = mainRemoteDataSource.getAllData()
            mainLocalDataSource.insertAllData(data.map { it.toData() }.map { it.toEntity() })
            emitAll(mainLocalDataSource.getAllData().map { item -> item.map { it.toData() } })
        }.catch {
            val prevData = mainLocalDataSource.getAllData().map { item -> item.map { it.toData() } }
            emitAll(prevData)
        }.flowOn(Dispatchers.IO)
    }
}