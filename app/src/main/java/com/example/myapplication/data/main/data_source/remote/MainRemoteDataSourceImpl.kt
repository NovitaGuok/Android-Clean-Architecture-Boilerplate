package com.example.myapplication.data.main.data_source.remote

import com.example.myapplication.data.main.data_source.remote.dto.DataDto
import com.example.myapplication.data.main.data_source.remote.service.MainService
import javax.inject.Inject

class MainRemoteDataSourceImpl @Inject constructor(private val mainService: MainService) :
    MainRemoteDataSource {
    override suspend fun getAllData(): List<DataDto> {
        val res = mainService.getAllData().body()
        return res?.dataList ?: listOf()
    }
}