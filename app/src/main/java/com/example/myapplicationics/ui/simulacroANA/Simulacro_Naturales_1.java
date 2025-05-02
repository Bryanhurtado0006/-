package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroNaturales1Binding;

public class Simulacro_Naturales_1 extends AppCompatActivity {

    private ActivitySimulacroNaturales1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroNaturales1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNatu1.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Naturales_1.this, Simulacro_Naturales_2.class);
            startActivity(intent);
        });
    }
}
