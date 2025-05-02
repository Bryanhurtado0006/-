package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityExamenCompletado4Binding;

public class Examen_Completado_4 extends AppCompatActivity {

    private ActivityExamenCompletado4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamenCompletado4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFinalizar4.setOnClickListener(view -> {
            Intent intent = new Intent(Examen_Completado_4.this, Estadistica_Sociales.class);
            startActivity(intent);
        });
    }
}
