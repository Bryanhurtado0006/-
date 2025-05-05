package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplicationics.databinding.ActivityInicioSimulacrosBinding;

public class Inicio_Simulacros extends AppCompatActivity {

    private ActivityInicioSimulacrosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInicioSimulacrosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.lectura.setOnClickListener(view -> {
            Intent intent = new Intent(this, Simulacro_Lectura_1.class);
            startActivity(intent);
        });

        binding.matematicas.setOnClickListener(view -> {
            Intent intent = new Intent(this, Simulacro_Matematicas_1.class);
            startActivity(intent);
        });

        binding.naturales.setOnClickListener(view -> {
            Intent intent = new Intent(this, Simulacro_Naturales_1.class);
            startActivity(intent);
        });

        binding.sociales.setOnClickListener(view -> {
            Intent intent = new Intent(this, Simulacro_Sociales_1.class);
            startActivity(intent);
        });

        binding.ingles.setOnClickListener(view -> {
            Intent intent = new Intent(this, Simulacro_Ingles_1.class);
            startActivity(intent);
        });
    }
}
