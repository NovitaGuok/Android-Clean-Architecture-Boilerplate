package com.example.myapplication.data.main.data_source.local

import com.example.myapplication.data.main.data_source.local.dao.MainDao
import com.example.myapplication.data.main.data_source.local.entity.DataEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainLocalDataSourceImpl @Inject constructor(private val mainDao: MainDao) :
    MainLocalDataSource {
    override fun getAllData(): Flow<List<DataEntity>> {
        return mainDao.getAllData()
    }

    override fun insertAllData(dataList: List<DataEntity>) {
        mainDao.insertNewData(dataList)
    }

    override fun deleteAllData() {
        mainDao.deleteAllData()
    }
}