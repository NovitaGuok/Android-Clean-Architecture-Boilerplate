package com.example.myapplication.data.main.data_source.remote.dto

import com.example.myapplication.domain.main.model.Data
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataDto(
    @SerialName("author")
    val author: String,

    @SerialName("download_url")
    val downloadUrl: String,

    @SerialName("height")
    val height: Int,

    @SerialName("id")
    val id: String,

    @SerialName("url")
    val url: String,

    @SerialName("width")
    val width: Int
)

fun DataDto.toData() = Data(
    this.author,
    this.downloadUrl,
    this.height,
    this.id,
    this.url,
    this.width
)