package com.example.myapplication.data.main.data_source.local

import com.example.myapplication.data.main.data_source.local.entity.DataEntity
import kotlinx.coroutines.flow.Flow

interface MainLocalDataSource {
    fun getAllData(): Flow<List<DataEntity>>
    fun insertAllData(dataList: List<DataEntity>)
    fun deleteAllData()
}