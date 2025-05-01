package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroIngles4Binding;

public class Simulacro_Ingles_4 extends AppCompatActivity {

    private ActivitySimulacroIngles4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroIngles4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngles4.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Ingles_4.this, Examen_Completado_5.class);
            startActivity(intent);
        });
    }
}
