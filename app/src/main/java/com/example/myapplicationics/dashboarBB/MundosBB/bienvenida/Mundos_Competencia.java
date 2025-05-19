package com.example.myapplicationics.dashboarBB.MundosBB.bienvenida;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.MundosActivity;
import com.example.myapplicationics.databinding.ActivityMundosCompetenciaBinding;

public class Mundos_Competencia extends AppCompatActivity {

    private ActivityMundosCompetenciaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMundosCompetenciaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        /*binding.btnComenzar.setOnClickListener(view -> {
            Intent intent = new Intent(Mundos_Competencia.this, MundosActivity.class);
            startActivity(intent);
        });*/
    }
}
