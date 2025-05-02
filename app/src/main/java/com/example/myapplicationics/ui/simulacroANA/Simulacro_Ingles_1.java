package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroIngles1Binding;

public class Simulacro_Ingles_1 extends AppCompatActivity {

    private ActivitySimulacroIngles1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroIngles1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngles1.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Ingles_1.this, Simulacro_Ingles_2.class);
            startActivity(intent);
        });
    }
}
