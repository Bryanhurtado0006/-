package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivitySimulacroSociales3Binding;

public class Simulacro_Sociales_3 extends AppCompatActivity {

    private ActivitySimulacroSociales3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimulacroSociales3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSociales3.setOnClickListener(view -> {
            Intent intent = new Intent(Simulacro_Sociales_3.this, Simulacro_Sociales_4.class);
            startActivity(intent);
        });
    }
}
