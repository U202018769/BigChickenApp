package com.grupo.bigchickenapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.grupo.bigchickenapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500)
        setTheme(R.style.Theme_BigChickenApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //para quitar la barra superior
        //window.setFlags(
        //    WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //    WindowManager.LayoutParams.FLAG_FULLSCREEN
        //)

    }
}