package com.example.myapplicationics.ui.simulacroANA;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityExamenCompletadoBinding;

public class Examen_Completado extends AppCompatActivity {

    private ActivityExamenCompletadoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExamenCompletadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFinalizar.setOnClickListener(view -> {
            Intent intent = new Intent(Examen_Completado.this, Estadistica_Lectura.class);
            startActivity(intent);
        });

        binding.btnGoToMain1.setOnClickListener(view->{
            Intent intent = new Intent(this, MainActivity_pantallaP.class);
            startActivity(intent);
        });
    }












    @Override
    protected void onDestroy() {
        super.onDestroy();

        binding = null;
    }

}
