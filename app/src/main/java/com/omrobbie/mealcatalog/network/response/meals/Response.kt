package com.omrobbie.mealcatalog.network.response.meals

import com.google.gson.annotations.SerializedName

data class Response(

        @field:SerializedName("meals")
        val meals: List<MealsItem?>? = null
)