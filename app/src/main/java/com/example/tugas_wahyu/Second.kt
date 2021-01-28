package com.example.tugas_wahyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tombolKembali=findViewById<Button>(R.id.btnKembali)
        tombolKembali.setOnClickListener {
            finish()
        }
    }
}
