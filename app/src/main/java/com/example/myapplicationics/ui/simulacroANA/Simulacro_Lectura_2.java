package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroLectura2Binding;

public class Simulacro_Lectura_2 extends AppCompatActivity {

    private ActivitySimulacroLectura2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroLectura2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSiguiente2.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Lectura_2.this, Simulacro_Lectura_3.class);
            startActivity(intent);
        });
    }
}
