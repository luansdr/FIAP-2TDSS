package com.example.qualifyprice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.qualifyprice.databinding.ActivityMainBinding
import com.example.qualifyprice.databinding.ActivityTelaCombustivelBinding

class tela_combustivel : AppCompatActivity() {

    private lateinit var binding: ActivityTelaCombustivelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaCombustivelBinding.inflate(layoutInflater)

        setContentView(binding.root)

        if(intent.getStringExtra("combustivel") != null){
            binding.combustivel.setText(intent.getStringExtra("combustivel"))

            var combustivel = binding.combustivel.toString();
            var calcular = binding.btnVoltar.setOnClickListener {

                finish()

            }
        }



    }
}