package com.example.myapplication.data.main.data_source.remote.service

import com.example.myapplication.data.main.data_source.remote.dto.DataListDto
import com.example.myapplication.utils.UrlRoute.MAIN_URL
import retrofit2.Response
import retrofit2.http.GET

interface MainService {
    @GET(MAIN_URL)
    suspend fun getAllData(): Response<DataListDto>
}