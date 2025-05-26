package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityBienvenidaTestBinding;

public class bienvenida_test extends AppCompatActivity {

    private ActivityBienvenidaTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBienvenidaTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Vamos.setOnClickListener(v -> {

            Intent intent = new Intent(bienvenida_test.this, TestVocacion_1.class);
            startActivity(intent);
        });
    }
}

