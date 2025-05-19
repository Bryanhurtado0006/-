package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityEstadisticaMatematicasBinding;

public class Estadistica_Matematicas extends AppCompatActivity {

    private ActivityEstadisticaMatematicasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEstadisticaMatematicasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIrASimulacros.setOnClickListener(view -> {
            Intent intent = new Intent(Estadistica_Matematicas.this, Inicio_Simulacros.class);
            startActivity(intent);
        });

        binding.btnGoToMain2.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity_pantallaP.class);
            startActivity(intent);
        });
    }
}
