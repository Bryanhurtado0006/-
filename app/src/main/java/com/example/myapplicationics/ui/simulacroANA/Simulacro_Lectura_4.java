package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroLectura4Binding;

public class Simulacro_Lectura_4 extends AppCompatActivity {

    private ActivitySimulacroLectura4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroLectura4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSiguiente4.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Lectura_4.this, Examen_Completado.class);
            startActivity(intent);
        });
    }
}
