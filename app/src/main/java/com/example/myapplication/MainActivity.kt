package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText


open class MainActivity : AppCompatActivity() {

    private lateinit var firstButton: Button

    val LOGIN: String = "admin"
    val PASSWORD: String = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstButton = findViewById(R.id.Fbutton)
        firstButton.setOnClickListener{
            val intent: Intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
            intent.putExtra(LOGIN, PASSWORD)

        }

    }
    val test = Test()


}

fun Test_1(_name: String, _age: Int, _isTrue: Boolean)  : Any{
    val name = _name + "Huesos"
    var age = _age + 10
    val isTrue = false
    return listOf(name, age, isTrue)
}