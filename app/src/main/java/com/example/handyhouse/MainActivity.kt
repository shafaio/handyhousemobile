package com.example.handyhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnToWelcome : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToWelcome = findViewById(R.id.toLogin)
        btnToWelcome.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.toLogin -> {
                val intentBiasa = Intent(this@MainActivity, WelcomeActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}