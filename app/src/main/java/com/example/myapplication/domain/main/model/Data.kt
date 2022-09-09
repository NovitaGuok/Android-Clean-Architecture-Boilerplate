package com.example.myapplication.domain.main.model

import com.example.myapplication.data.main.data_source.local.entity.DataEntity

data class Data(
    val author: String,
    val downloadUrl: String,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)

fun Data.toEntity() = DataEntity(
    this.id,
    this.author,
    this.downloadUrl,
    this.height,
    this.url,
    this.width
)