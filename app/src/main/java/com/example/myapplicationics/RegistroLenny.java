package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityRegistroLennyBinding;


public class RegistroLenny extends AppCompatActivity {
    private ActivityRegistroLennyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_lenny);
        binding = ActivityRegistroLennyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCrearCuenta.setOnClickListener(View  -> {
            Intent intent = new Intent(RegistroLenny.this, Cuentas_Registro_Lenny.class);
            startActivity(intent);
        });

    }
}