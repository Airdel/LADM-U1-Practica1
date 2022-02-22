package mx.tecnm.tepic.layoutspractica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*
import mx.tecnm.tepic.layoutspractica1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val botonEstrellas = binding.btnEstrellas
        btnEstrellas.setOnClickListener {
            verEstrellas()
        }
        val botonAgujeros = binding.btnAgujeros
        btnAgujeros.setOnClickListener {
            verAgujeros()
        }


    }

    private fun verEstrellas(){
        btnEstrellas.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
    private fun verAgujeros(){
        btnAgujeros.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

}