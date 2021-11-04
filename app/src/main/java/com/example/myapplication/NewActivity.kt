package com.example.myapplication

import android.os.Bundle
import android.view.View

class NewActivity: MainActivity() {
    private lateinit var square: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        val LOGIN = intent.extras?.getString(LOGIN)
        val PASSWORD = intent.extras?.getString(PASSWORD)
    }



}