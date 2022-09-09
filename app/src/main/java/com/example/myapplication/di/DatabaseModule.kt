package com.example.myapplication.di

import android.app.Application
import androidx.room.Room
import com.example.myapplication.db.AppDb
import com.example.myapplication.utils.Constant.Companion.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun providesAppDb(app: Application): AppDb {
        return Room.databaseBuilder(app, AppDb::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration().allowMainThreadQueries().build()
    }

    @Provides
    fun providesPopularBooksDao(appDb: AppDb) = appDb.mainDao()
}