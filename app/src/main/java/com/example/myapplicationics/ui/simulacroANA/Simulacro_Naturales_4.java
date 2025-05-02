package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroNaturales4Binding;

public class Simulacro_Naturales_4 extends AppCompatActivity {

    private ActivitySimulacroNaturales4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroNaturales4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNatu4.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Naturales_4.this, Examen_Completado_3.class);
            startActivity(intent);
        });
    }
}
