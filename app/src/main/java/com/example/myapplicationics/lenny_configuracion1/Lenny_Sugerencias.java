package com.example.myapplicationics.lenny_configuracion1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityLennySugerenciasBinding;

public class Lenny_Sugerencias extends AppCompatActivity {

    private ActivityLennySugerenciasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLennySugerenciasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAtras.setOnClickListener(view -> {
            Intent intent = new Intent(Lenny_Sugerencias.this, Lenny_Perfil.class);
            startActivity(intent);
        });



    }
}