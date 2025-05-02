package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityInicioSimulacrosBinding;

public class Inicio_Simulacros extends AppCompatActivity {

    private ActivityInicioSimulacrosBinding binding; // Este es el binding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityInicioSimulacrosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.lectura.setOnClickListener(lectura -> {
            Intent intent = new Intent(Inicio_Simulacros.this, Simulacro_Lectura_1.class);
            startActivity(intent);

            binding.matematicas.setOnClickListener(matematicas -> {
                Intent intent2 = new Intent(Inicio_Simulacros.this, Simulacro_Matematicas_1.class);
                startActivity(intent2);

                binding.naturales.setOnClickListener(naturales -> {
                    Intent intent3 = new Intent(Inicio_Simulacros.this, Simulacro_Naturales_1.class);
                    startActivity(intent3);

                    binding.sociales.setOnClickListener(sociales -> {
                        Intent intent4 = new Intent(Inicio_Simulacros.this, Simulacro_Sociales_1.class);
                        startActivity(intent4);

                        binding.ingles.setOnClickListener(ingles -> {
                            Intent intent5 = new Intent(Inicio_Simulacros.this, Simulacro_Ingles_1.class);
                            startActivity(intent5);
                        });
                    });
                });
            });
        });
    }
}

