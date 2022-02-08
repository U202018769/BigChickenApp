package com.grupo.bigchickenapp.activities

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.grupo.bigchickenapp.Producto
import com.grupo.bigchickenapp.R
import com.grupo.bigchickenapp.utils.MSPButton
import com.grupo.bigchickenapp.utils.MSPEditText

class CreateProductoActivity : AppCompatActivity() {
    private lateinit var et_nombreProducto: MSPEditText
    private lateinit var et_precioVentaProducto: MSPEditText
    private lateinit var et_precioCostoProducto: MSPEditText
    private lateinit var et_URL: MSPEditText
    private lateinit var btn_crearProducto2: MSPButton

    private var db = Firebase.database



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_producto)
        //para quitar las barras superiores
        getSupportActionBar()?.hide()

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        asignarReferencias()
    }

    private fun asignarReferencias() {
        et_nombreProducto = findViewById(R.id.et_nombreProducto)
        et_precioVentaProducto = findViewById(R.id.et_precioVentaProducto)
        et_precioCostoProducto = findViewById(R.id.et_precioCostoProducto)
        et_URL = findViewById(R.id.et_URL)
        btn_crearProducto2 = findViewById(R.id.btn_crearProducto2)
        btn_crearProducto2.setOnClickListener {
            guardar()
        }
    }

    private fun guardar() {
        val reference = db.getReference("producto")
        val nombre = et_nombreProducto.text.toString()
        val precioVenta = et_precioVentaProducto.text.toString()
        val precioCosto = et_precioCostoProducto.text.toString()
        val url = et_URL.text.toString()

        val pro = Producto(nombre, precioVenta, precioCosto, url)
        reference.child(reference.push().key.toString()).setValue(pro)
        finish()
    }
}
