package com.example.myapplicationics.iu.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityDanielRestablecerContrasena1Binding;

public class Daniel_restablecer_contrasena_1 extends AppCompatActivity {

    private ActivityDanielRestablecerContrasena1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityDanielRestablecerContrasena1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnSiguiente.setOnClickListener(v -> {
            Intent intent = new Intent(this, Daniel_restablecer_contrasena_2.class);
            startActivity(intent);
        });
    }
}
