package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityEstadisticaNaturalesBinding;

public class Estadistica_Naturales extends AppCompatActivity {

    private ActivityEstadisticaNaturalesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEstadisticaNaturalesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIrASimulacros.setOnClickListener(view -> {
            Intent intent = new Intent(Estadistica_Naturales.this, Inicio_Simulacros.class);
            startActivity(intent);
        });

        binding.btnGoToMain3.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity_pantallaP.class);
            startActivity(intent);
        });
    }
}
