package com.grupo.bigchickenapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupo.bigchickenapp.R
import com.grupo.bigchickenapp.utils.MSPTextViewBold


@Suppress("DEPRECATION")
class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)


        //window.setFlags(
        //    WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //    WindowManager.LayoutParams.FLAG_FULLSCREEN
        //)

        val tvlogin = findViewById<MSPTextViewBold>(R.id.tv_login)
        tvlogin.setOnClickListener{
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
       }
    }
}
