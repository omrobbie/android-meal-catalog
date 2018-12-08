package com.omrobbie.mealcatalog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListofMeal()
    }

    private fun initListofMeal() {
        val adapter = MealAdapter(this)

        rv_list.adapter = adapter
        rv_list.layoutManager = LinearLayoutManager(this)
    }
}
