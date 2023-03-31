package com.example.handyhouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var toLogin : Button
    private lateinit var toRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        toLogin = findViewById(R.id.login)
        toRegister = findViewById(R.id.register)

        toLogin.setOnClickListener(this)
        toRegister.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.login -> {
                val intentToLogin = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(intentToLogin)
            }

            R.id.register -> {
                val intentToRegister = Intent(this@WelcomeActivity, RegisterActivity::class.java)
                startActivity(intentToRegister)
            }
        }
    }
}