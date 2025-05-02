package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroNaturales3Binding;

public class Simulacro_Naturales_3 extends AppCompatActivity {

    private ActivitySimulacroNaturales3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroNaturales3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNatu3.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Naturales_3.this, Simulacro_Naturales_4.class);
            startActivity(intent);
        });
    }
}
