package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityEstadisticaSocialesBinding;

public class Estadistica_Sociales extends AppCompatActivity {

    private ActivityEstadisticaSocialesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEstadisticaSocialesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIrASimulacros.setOnClickListener(view -> {
            Intent intent = new Intent(Estadistica_Sociales.this, Inicio_Simulacros.class);
            startActivity(intent);
        });
    }
}
