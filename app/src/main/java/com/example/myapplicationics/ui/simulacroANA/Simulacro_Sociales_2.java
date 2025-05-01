package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroSociales2Binding;

public class Simulacro_Sociales_2 extends AppCompatActivity {

    private ActivitySimulacroSociales2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroSociales2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSociales2.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Sociales_2.this, Simulacro_Sociales_3.class);
            startActivity(intent);
        });
    }
}
