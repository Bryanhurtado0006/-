package com.example.myapplicationics.iu.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplicationics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvSobreNosotros.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Sobre_Nosotros.class);
            startActivity(intent);
        });

        binding.btnInicoSecion.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Inicio_Sesion_Principal.class);
            startActivity(intent);
        });
    }
}
