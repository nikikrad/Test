package com.example.myapplication

import android.os.Bundle
import com.example.myapplication.databinding.ActivityFrontBinding

class FrontActivity: MainActivity() {

    private lateinit var binding: ActivityFrontBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrontBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}