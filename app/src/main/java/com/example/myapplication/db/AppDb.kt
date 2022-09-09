package com.example.myapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.BuildConfig.DB_VERSION
import com.example.myapplication.data.main.data_source.local.dao.MainDao
import com.example.myapplication.data.main.data_source.local.entity.DataEntity

@Database(
    entities = [DataEntity::class],
    version = DB_VERSION,
    exportSchema = true
)
abstract class AppDb : RoomDatabase() {
    abstract fun mainDao(): MainDao
}