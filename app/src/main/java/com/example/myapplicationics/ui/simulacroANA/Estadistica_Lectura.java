package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityEstadisticaLecturaBinding;

public class Estadistica_Lectura extends AppCompatActivity {

    private ActivityEstadisticaLecturaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEstadisticaLecturaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIrASimulacros.setOnClickListener(view -> {
            Intent intent = new Intent(Estadistica_Lectura.this, Inicio_Simulacros.class);
            startActivity(intent);
        });

        binding.btnGoToMain1.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity_pantallaP.class);
            startActivity(intent);
        });
    }
}
