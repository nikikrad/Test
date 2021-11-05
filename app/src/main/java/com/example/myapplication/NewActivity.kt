package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityNewBinding

class NewActivity: MainActivity() {

    private lateinit var binding: ActivityNewBinding

    companion object {
        const val LOGIN : String = "LOGIN"
        const val PASSWORD : String = "PASSWORD"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_new)

        val login: String? = intent.getStringExtra(LOGIN)
        val password: String? = intent.getStringExtra(PASSWORD)

        binding.logPass.text = login.toString()

        binding.btnForInfo.setOnClickListener{
//            if (login == "admin" || password == "admin") {
//                reg()
//            }
            reg()
        }
    }

    fun reg(){
            binding.tvViewInfo.visibility = View.VISIBLE
    }

}