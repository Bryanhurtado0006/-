package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroLectura3Binding;

public class Simulacro_Lectura_3 extends AppCompatActivity {

    private ActivitySimulacroLectura3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroLectura3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSiguiente3.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Lectura_3.this, Simulacro_Lectura_4.class);
            startActivity(intent);
        });
    }
}
