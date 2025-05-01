package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroMatematicas2Binding;

public class Simulacro_Matematicas_2 extends AppCompatActivity {

    private ActivitySimulacroMatematicas2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroMatematicas2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMate2.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Matematicas_2.this, Simulacro_Matematicas_3.class);
            startActivity(intent);
        });
    }
}
