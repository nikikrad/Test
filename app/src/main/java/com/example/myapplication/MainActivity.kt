package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding


open class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val login: String = "admin"
    val password: String = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.Fbutton.setOnClickListener{
            val intent: Intent = Intent(this, NewActivity::class.java)
            intent.putExtra(NewActivity.LOGIN, login)
            intent.putExtra(NewActivity.PASSWORD, password)
            startActivity(intent)
        }

//        Glide
//            .with(this)
//            .load( URL("https://img3.akspic.ru/originals/2/8/8/7/4/147882-poni-rozovyj-liniya-kartinka-televideniye-750x1334.jpg"))
//            .into()



    }
    val test = Test()


}

fun Test_1(_name: String, _age: Int, _isTrue: Boolean)  : Any{
    val name = _name + "Huesos"
    var age = _age + 10
    val isTrue = false
    return listOf(name, age, isTrue)
}