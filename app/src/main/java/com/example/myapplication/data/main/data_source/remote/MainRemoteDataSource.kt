package com.example.myapplication.data.main.data_source.remote

import com.example.myapplication.data.main.data_source.remote.dto.DataDto

interface MainRemoteDataSource {
    suspend fun getAllData(): List<DataDto>
}