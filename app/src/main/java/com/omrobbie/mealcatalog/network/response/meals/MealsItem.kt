package com.omrobbie.mealcatalog.network.response.meals

import com.google.gson.annotations.SerializedName

data class MealsItem(

        @field:SerializedName("strMealThumb")
        val strMealThumb: String? = null,

        @field:SerializedName("idMeal")
        val idMeal: String? = null,

        @field:SerializedName("strMeal")
        val strMeal: String? = null
)