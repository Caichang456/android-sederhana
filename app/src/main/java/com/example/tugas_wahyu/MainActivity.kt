package com.example.tugas_wahyu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tombolOpenActivity=findViewById<Button>(R.id.btnOpenActivity)
        val tombolPhoneDialer=findViewById<Button>(R.id.btnPhoneDialer)
        val tombolPeta=findViewById<Button>(R.id.btnMap)
        val ketikNama=findViewById<EditText>(R.id.txtUserName)
        val ketikPass=findViewById<EditText>(R.id.txtPassWord)
        val tombolLogin=findViewById<Button>(R.id.btnLogin)
        val intn=Intent(this,Second::class.java)

        tombolOpenActivity.setOnClickListener {
            startActivity(intn)
        }

        tombolPhoneDialer.setOnClickListener {
            val nomorTelepon:String="089644978904"
            val intnTel=Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+nomorTelepon))
            startActivity(intnTel)
        }
        tombolPeta.setOnClickListener {
            val Lokasi=Uri.parse("geo:3.642087,98.690856")
            val petaIntn=Intent(Intent.ACTION_VIEW,Lokasi)
            petaIntn.setPackage("com.google.android.apps.maps")
            startActivity(petaIntn)
        }
        tombolLogin.setOnClickListener {
            if(ketikNama.text.toString()=="") Toast.makeText(this,"User Name tidak boleh kosong",Toast.LENGTH_LONG).show()
            else if(ketikPass.text.toString()=="") Toast.makeText(this,"Password tidak boleh kosong",Toast.LENGTH_LONG).show()
            else if(ketikNama.text.toString()=="admin"&&ketikPass.text.toString()=="12345") startActivity(intn)
            else Toast.makeText(this,"Login Gagal",Toast.LENGTH_LONG).show()
        }
    }
}
