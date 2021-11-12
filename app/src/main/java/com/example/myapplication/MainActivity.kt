package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
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

//        binding.btnSecret.setOnClickListener {
//            if(binding.secretImage.isInvisible)
//                binding.secretImage.visibility = View.VISIBLE
//            else if (binding.secretImage.isVisible)
//                binding.secretImage.visibility = View.INVISIBLE

        val workers = listOf(
            Worker("Nikita", "Shurikov"),
            Worker("Nikita1", "Shurikov"),
            Worker("Nikita2", "Shurikov"),
            Worker("Nikita3", "Shurikov"),
            Worker("Nikita4", "Shurikov"),
            Worker("Nikita5", "Shurikov"),
            Worker("Nikita6", "Shurikov"),
            Worker("Nikita7", "Shurikov"),
            Worker("Nikita8", "Shurikov")
        )

        val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_2, workers)

        binding.lvWorkers?.adapter = myAdapter

        }


    }
    val test = Test()




fun Test_1(_name: String, _age: Int, _isTrue: Boolean)  : Any{
    val name = _name + "Huesos"
    var age = _age + 10
    val isTrue = false
    return listOf(name, age, isTrue)
}