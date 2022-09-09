package com.example.myapplication.data.main.data_source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.domain.main.model.Data

@Entity(tableName = "main")
data class DataEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "author")
    val author: String,

    @ColumnInfo(name = "download_url")
    val downloadUrl: String,

    @ColumnInfo(name = "height")
    val height: Int,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "width")
    val width: Int
)

fun DataEntity.toData() = Data(
    this.author,
    this.downloadUrl,
    this.height,
    this.id,
    this.url,
    this.width
)