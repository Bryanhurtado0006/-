package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroMatematicas4Binding;

public class Simulacro_Matematicas_4 extends AppCompatActivity {

    private ActivitySimulacroMatematicas4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroMatematicas4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMate4.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Matematicas_4.this, Examen_Completado_2.class);
            startActivity(intent);
        });
    }
}
