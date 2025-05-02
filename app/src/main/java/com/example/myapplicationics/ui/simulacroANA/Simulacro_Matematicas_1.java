package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroMatematicas1Binding;

public class Simulacro_Matematicas_1 extends AppCompatActivity {

    private ActivitySimulacroMatematicas1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroMatematicas1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMate1.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Matematicas_1.this, Simulacro_Matematicas_2.class);
            startActivity(intent);
        });
    }
}
