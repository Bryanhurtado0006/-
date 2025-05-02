package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroIngles2Binding;

public class Simulacro_Ingles_2 extends AppCompatActivity {

    private ActivitySimulacroIngles2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroIngles2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngles2.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Ingles_2.this, Simulacro_Ingles_3.class);
            startActivity(intent);
        });
    }
}
