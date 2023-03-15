package com.philipplackner.converter

import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyService {
    @GET
    suspend fun getRates(@Query())
}