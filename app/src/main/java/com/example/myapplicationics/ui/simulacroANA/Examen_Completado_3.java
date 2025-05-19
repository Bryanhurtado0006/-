package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityExamenCompletado3Binding;

public class Examen_Completado_3 extends AppCompatActivity {

    private ActivityExamenCompletado3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamenCompletado3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFinalizar3.setOnClickListener(view -> {
            Intent intent = new Intent(Examen_Completado_3.this, Estadistica_Naturales.class);
            startActivity(intent);
        });
    }
}
