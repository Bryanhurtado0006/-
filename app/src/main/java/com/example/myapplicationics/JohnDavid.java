package com.example.myapplicationics;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JohnDavid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_john_david);
        TextView mensaje = findViewById(R.id.textoMensaje);

        new Handler().postDelayed(() -> {
            mensaje.setText("Este diagnóstico nos ayudará a conocer tu estilo de aprendizaje y así personalizar mejor tu experiencia");


            new Handler().postDelayed(() -> {
                mensaje.setText("Presiona el boton siguiente para continuar");
            }, 7000);
        }, 7000);
    }
}



