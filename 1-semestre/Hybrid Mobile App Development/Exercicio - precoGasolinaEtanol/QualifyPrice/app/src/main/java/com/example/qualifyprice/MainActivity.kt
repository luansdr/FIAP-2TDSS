package com.example.qualifyprice

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.qualifyprice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var btnCalcular = binding.btnCalcular.setOnClickListener {

            onClicker()


        }



    }


    override fun onResume() {
        super.onResume()
        var gasolina = binding.precoGasolina.setText("")
        var etanol = binding.precoEtanol.setText("")
    }


    fun onClicker(){
        var gasolina = binding.precoGasolina.text.toString()
        var etanol = binding.precoEtanol.text.toString()

        if(gasolina != "" || etanol != ""){
            var precoGasolina = gasolina.toDouble()
            var precoEtanol = etanol.toDouble()

            var melhorCombustivel = ""

            var PreferenciaCombustil: Double = precoEtanol / precoGasolina;

            if(PreferenciaCombustil > 0.7) {
                melhorCombustivel = "Compensa a Gasolina"
            } else if(PreferenciaCombustil < 0.7){
                melhorCombustivel = "Compensa o Álcool"
            }else{
                melhorCombustivel = "Tanto faz"
            }

            val intent = Intent(this, tela_combustivel::class.java )
            intent.putExtra("combustivel", melhorCombustivel)
            startActivity(intent)
        }else{
            val toast = Toast.makeText(applicationContext, "Preencha todos os campos", Toast.LENGTH_LONG)
            toast.show()        }



    }
}