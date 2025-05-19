package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityExamenCompletado2Binding;

public class Examen_Completado_2 extends AppCompatActivity {

    private ActivityExamenCompletado2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamenCompletado2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFinalizar2.setOnClickListener(view -> {
            Intent intent = new Intent(Examen_Completado_2.this, Estadistica_Matematicas.class);
            startActivity(intent);
        });
    }








    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding = null;
    }
    }

