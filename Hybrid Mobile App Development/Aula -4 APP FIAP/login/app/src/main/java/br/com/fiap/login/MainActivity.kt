package br.com.fiap.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEntrar = findViewById<Button>(R.id.btn_entrar)
        btnEntrar.setOnClickListener {
            if(verificarCampos()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", findViewById<EditText>(R.id.et_username).text.toString())
                startActivity(intent)
                finish()
            }

        }


        val tvCadastrar = findViewById<TextView>(R.id.tv_cadastrar)
        tvCadastrar.setOnClickListener {
            exibirMensagem("Ir para CadastrarActivity", mensagem = "Estamos em construção")
        }


        val tvEsqueceu = findViewById<TextView>(R.id.tv_esqueceu)
        tvEsqueceu.setOnClickListener {
            exibirMensagem("Ir para EsqueceuActivity", mensagem = "Estamos em construção")
        }

    }




    fun exibirMensagem(titulo: String, mensagem: String){

        val builder = AlertDialog.Builder(this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton("Ok", null)

        builder.create().show()

    }


        fun verificarCampos(): Boolean {
            val campoUser = findViewById<EditText>(R.id.et_username)
            val campoSenha = findViewById<EditText>(R.id.et_senha)

            if(campoUser.text.toString() == "" || campoSenha.text.toString() == ""){
                val toast: Toast = Toast.makeText(this, "Informe todos os campos", Toast.LENGTH_LONG)
                toast.show()
                return false
            }else{
                return true
            }
        }



}