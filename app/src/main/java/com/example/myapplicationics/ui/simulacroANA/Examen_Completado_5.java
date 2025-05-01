package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityExamenCompletado5Binding;

public class Examen_Completado_5 extends AppCompatActivity {

    private ActivityExamenCompletado5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamenCompletado5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFinalizar5.setOnClickListener(view -> {
            Intent intent = new Intent(Examen_Completado_5.this, Estadistica_Ingles.class);
            startActivity(intent);
        });
    }
}
