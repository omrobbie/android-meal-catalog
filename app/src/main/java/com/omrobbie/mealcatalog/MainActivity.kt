package com.omrobbie.mealcatalog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.omrobbie.mealcatalog.network.InitRetrofit
import com.omrobbie.mealcatalog.network.response.meals.MealsItem
import com.omrobbie.mealcatalog.network.response.meals.Response
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initListofMeal()
        requestDataHome()
    }

    private fun initListofMeal(dataMeals: List<MealsItem?>) {
        dataMeals.let {
            val adapter = MealAdapter(this, it)

            rv_list.adapter = adapter
            rv_list.layoutManager = LinearLayoutManager(this)
        }
    }

    private fun requestDataHome() {
        InitRetrofit().instance().requestHomeMeals("Canadian")
                .enqueue(object : Callback<Response> {
                    override fun onFailure(call: Call<Response>, t: Throwable) {
                        t.printStackTrace()
                        Log.d("xxx Error:", t.printStackTrace().toString())
                    }

                    override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                        if (response.isSuccessful) {
                            Log.d("xxx Success:", response.body().toString())

                            val dataMeals = response.body()?.meals

                            dataMeals?.let {
                                initListofMeal(it)
                            }
                        }
                    }
                })
    }
}
