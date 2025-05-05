package com.example.myapplicationics.iu.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityDanielRestablecerContrasena2Binding;

public class Daniel_restablecer_contrasena_2 extends AppCompatActivity {

    // ViewBinding
    private ActivityDanielRestablecerContrasena2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializar ViewBinding
        binding = ActivityDanielRestablecerContrasena2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Botón que navega al siguiente activity
        binding.btnContinuar.setOnClickListener(v -> {
            Intent intent = new Intent(this, Daniel_restablecer_contrasena_3.class);
            startActivity(intent);
        });
    }
}
