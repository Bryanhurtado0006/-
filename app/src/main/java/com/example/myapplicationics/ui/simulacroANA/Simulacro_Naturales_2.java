package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroNaturales2Binding;

public class Simulacro_Naturales_2 extends AppCompatActivity {

    private ActivitySimulacroNaturales2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroNaturales2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnNatu2.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Naturales_2.this, Simulacro_Naturales_3.class);
            startActivity(intent);
        });
    }
}
