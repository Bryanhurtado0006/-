package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroLectura1Binding;

public class Simulacro_Lectura_1 extends AppCompatActivity {

    private ActivitySimulacroLectura1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroLectura1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSiguiente1.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Lectura_1.this, Simulacro_Lectura_2.class);
            startActivity(intent);
        });
    }
}
