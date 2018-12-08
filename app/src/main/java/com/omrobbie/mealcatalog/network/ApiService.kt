package com.omrobbie.mealcatalog.network

import com.omrobbie.mealcatalog.network.response.meals.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("filter.php")
    fun requestHomeMeals(
            @Query("a") area: String
    ) : Call<Response>
}
