package br.com.fiap.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val it = intent.extras!!.getString("username")

        val inputUser = findViewById<TextView>(R.id.tv_username)
        inputUser.setText(it)



        val actionBar: ActionBar? = getSupportActionBar()
        if(actionBar != null)
            actionBar.setTitle("Home")


        val btnSair = findViewById<Button>(R.id.btn_sair)
        btnSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}