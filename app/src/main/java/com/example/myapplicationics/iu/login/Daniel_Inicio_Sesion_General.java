package com.example.myapplicationics.iu.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityDanielInicioSesionRegistroBinding;

public class Daniel_Inicio_Sesion_General extends AppCompatActivity {

    private ActivityDanielInicioSesionRegistroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDanielInicioSesionRegistroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnInicoSecion.setOnClickListener(v -> {
            Intent intent = new Intent(this, Inicio_Sesion_Principal.class);
            startActivity(intent);
        });
    }
}
