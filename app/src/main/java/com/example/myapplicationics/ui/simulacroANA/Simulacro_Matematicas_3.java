package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroMatematicas3Binding;

public class Simulacro_Matematicas_3 extends AppCompatActivity {

    private ActivitySimulacroMatematicas3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroMatematicas3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMate3.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Matematicas_3.this, Simulacro_Matematicas_4.class);
            startActivity(intent);
        });
    }
}
