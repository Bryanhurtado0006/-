package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityEstadisticaInglesBinding;

public class Estadistica_Ingles extends AppCompatActivity {

    private ActivityEstadisticaInglesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEstadisticaInglesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIrASimulacros.setOnClickListener(view -> {
            Intent intent = new Intent(Estadistica_Ingles.this, Inicio_Simulacros.class);
            startActivity(intent);
        });
    }
}
