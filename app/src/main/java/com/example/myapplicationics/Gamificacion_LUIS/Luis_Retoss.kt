package com.example.myapplicationics.Gamificacion_LUIS  // Usa tu paquete real aquí

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationics.R  // Asegúrate de importar tu R correctamente

class Luis_Retoss : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luis_retos)

        // --- Reto 1 ---
        val btnVerMas1 = findViewById<Button>(R.id.BTN_verMasBtn1)
        val txtDetalle1 = findViewById<TextView>(R.id.TXT_detalle_Reto1)

        btnVerMas1.setOnClickListener {
            val isVisible = txtDetalle1.visibility == View.VISIBLE
            txtDetalle1.visibility = if (isVisible) View.GONE else View.VISIBLE
            btnVerMas1.text = if (isVisible) "▶" else "▼"
        }

        // --- Reto 2 ---
        val btnVerMas2 = findViewById<Button>(R.id.BTN_verMasBtn2)
        val txtDetalle2 = findViewById<TextView>(R.id.TXT_detalleReto2)

        btnVerMas2.setOnClickListener {
            val isVisible = txtDetalle2.visibility == View.VISIBLE
            txtDetalle2.visibility = if (isVisible) View.GONE else View.VISIBLE
            btnVerMas2.text = if (isVisible) "▶" else "▼"
        }
    }
}
