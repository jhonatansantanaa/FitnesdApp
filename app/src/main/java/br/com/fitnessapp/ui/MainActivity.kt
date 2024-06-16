package br.com.fitnessapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import br.com.fitnessapp.R
import br.com.fitnessapp.databinding.ActivityHomeBinding
import br.com.fitnessapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnNv.setOnClickListener {
           val intent = Intent(this, HomeActivity::class.java)
           startActivity(intent)
       }

    }

}