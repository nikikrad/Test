package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding


open class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val login: String = "admin"
    val password: String = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(binding.container.id, LastFragment())
            .addToBackStack(null)
            .commit()


        binding.Fbutton.setOnClickListener{
            val intent: Intent = Intent(this, NewActivity::class.java)
            intent.putExtra(NewActivity.LOGIN, login)
            intent.putExtra(NewActivity.PASSWORD, password)
            startActivity(intent)


        }

        val workerList = listOf(
            Worker("Nikitos", "Shurikov"),
            Worker("Oleg", "Shurikov"),
            Worker("Djimichu", "Shurikov"),
            Worker("Anton", "Shurikov"),
            Worker("CJ", "Shurikov"),
            Worker("Nikitos", "Kopatich"),
            Worker("Den", "Shurikov"),
            Worker("Artem", "Shurikov"),
            Worker("Max", "Shurikov"),
            Worker("Nikitos", "Sinyaga"),
            Worker("Nikitos", "Skurach"),
            Worker("Nikitos", "Maruev"),

        )

        val workersAdapter = WorkersAdapter(workerList)
        binding.rvWorkers?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvWorkers.adapter = workersAdapter

//        Glide
//            .with(this)
//            .load( URL("https://img3.akspic.ru/originals/2/8/8/7/4/147882-poni-rozovyj-liniya-kartinka-televideniye-750x1334.jpg"))
//            .into()

//        binding.btnSecret.setOnClickListener {
//            if(binding.secretImage.isInvisible)
//                binding.secretImage.visibility = View.VISIBLE
//            else if (binding.secretImage.isVisible)
//                binding.secretImage.visibility = View.INVISIBLE


    }

//    override fun onDestroy() {// TODO выключить приложение при нажатии на кнопку
//        super.onDestroy()
//    }


    }



    val test = Test()




fun Test_1(_name: String, _age: Int, _isTrue: Boolean)  : Any{
    val name = _name + "Huesos"
    var age = _age + 10
    val isTrue = false
    return listOf(name, age, isTrue)
}