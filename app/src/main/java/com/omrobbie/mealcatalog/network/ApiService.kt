package com.omrobbie.mealcatalog.network

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("filter.php")
    fun requestHomeMeals(
            @Query("a") area: String
    )
}
