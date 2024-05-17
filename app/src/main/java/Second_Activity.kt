package com.example.android1lesson5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android1lesson5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val carsListAdapter = CarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillCarsList()
        setupRecyclerView()
    }

    private fun fillCarsList() {
        val carsList = listOf(
            Car("Bugatti Divo", R.drawable.img_1, 4, 380),
            Car("Bmw", R.drawable.img, 4, 290),
            Car("Lamborghini Aventador", R.drawable.img_2, 4, 230),
            Car("Ford Mustang", R.drawable.img_4, 4, 210),

        )
        carsListAdapter.setData(carsList)
    }

    private fun setupRecyclerView() {
        binding.rvCar.adapter = carsListAdapter
    }
}