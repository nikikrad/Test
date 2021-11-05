package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
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
        setContentView(binding.root)

        val login: String? = intent.getStringExtra(LOGIN)
        val password: String? = intent.getStringExtra(PASSWORD)

        binding.logPass.text = login.toString()

        binding.btnForInfo.setOnClickListener{
//            if (login == "admin" || password == "admin") {
//                reg()
//            }
//            reg()
            if(binding.tvViewInfo.isInvisible)
                binding.tvViewInfo.visibility = View.VISIBLE
            else if (binding.tvViewInfo.isVisible)
                binding.tvViewInfo.visibility = View.INVISIBLE
        }

        binding.btnBack.setOnClickListener {
        val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    fun reg(){

            binding.tvViewInfo.visibility = View.VISIBLE
    }

}