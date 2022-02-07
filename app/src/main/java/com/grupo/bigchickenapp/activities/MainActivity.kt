package com.grupo.bigchickenapp.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.grupo.bigchickenapp.R
import com.grupo.bigchickenapp.utils.Constants
import com.grupo.bigchickenapp.utils.MSPButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var btnNuevo: MSPButton

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_BigChickenApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //para quitar las barras superiores
        getSupportActionBar()?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Creamos una instancia de Android SharedPreferences
        val sharedPreferences =
            getSharedPreferences(Constants.BIGCHICKEN_PREFERENCES, Context.MODE_PRIVATE)

        val username = sharedPreferences.getString(Constants.LOGGED_IN_USERNAME, "")!!
        // Setea el reslutado a  tv_main.
        tv_main.text = "Usted esta trabajando con el usuario: $username."
        asignarReferencias()


        }

        private fun asignarReferencias() {
            btnNuevo = findViewById(R.id.btn_crearProducto)
            btnNuevo.setOnClickListener{
                val intent = Intent (this, CreateProductoActivity::class.java)
                startActivity(intent)
            }
        }


}