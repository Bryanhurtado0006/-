package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroIngles3Binding;

public class Simulacro_Ingles_3 extends AppCompatActivity {

    private ActivitySimulacroIngles3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroIngles3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Botón "Siguiente" lleva a Simulacro_Lectura_2
        binding.btnIngles3.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Ingles_3.this, Simulacro_Ingles_4.class);
            startActivity(intent);
        });
    }
}
