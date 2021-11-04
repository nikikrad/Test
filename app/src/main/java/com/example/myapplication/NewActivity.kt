package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible

class NewActivity: MainActivity() {
    private lateinit var square: View
    private lateinit var view: View



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        val LOGIN: String? = intent.extras?.getString(LOGIN)
        val PASSWORD: String? = intent.extras?.getString(PASSWORD)
        reg(LOGIN, PASSWORD)
    }

    fun reg(login:String? = "default", password: String? = "default"){
        if (login == "admin" || password == "admin")
            view = findViewById(R.id.v_viewInfo)


    }

}