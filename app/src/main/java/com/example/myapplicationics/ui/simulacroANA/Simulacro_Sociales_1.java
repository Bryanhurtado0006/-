package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroSociales1Binding;

public class Simulacro_Sociales_1 extends AppCompatActivity {

    private ActivitySimulacroSociales1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroSociales1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSociales1.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Sociales_1.this, Simulacro_Sociales_2.class);
            startActivity(intent);
        });
    }
}
