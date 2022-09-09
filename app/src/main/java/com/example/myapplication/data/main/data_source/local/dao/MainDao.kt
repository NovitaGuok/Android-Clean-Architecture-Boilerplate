package com.example.myapplication.data.main.data_source.local.dao

import androidx.room.*
import com.example.myapplication.data.main.data_source.local.entity.DataEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MainDao {
    @Query("SELECT * FROM main")
    fun getAllData(): Flow<List<DataEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNewData(dataList: List<DataEntity>)

    @Query("DELETE FROM main")
    fun deleteAllData()
}