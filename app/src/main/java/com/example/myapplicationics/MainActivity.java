package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplicationics.databinding.ActivityMainBinding;
import com.example.myapplicationics.iu.login.Daniel_Inicio_Sesion_General;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inicializa el ViewBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Navega a la pantalla de inicio de sesión
        binding.btnIrInicioSesion.setOnClickListener(v -> {
            Intent intent = new Intent(this, Daniel_Inicio_Sesion_General.class);
            startActivity(intent);
        });
    }
}
