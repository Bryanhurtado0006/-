package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroSociales4Binding;

public class Simulacro_Sociales_4 extends AppCompatActivity {

    private ActivitySimulacroSociales4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroSociales4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSociales4.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Sociales_4.this, Examen_Completado_4.class);
            startActivity(intent);
        });
    }
}
