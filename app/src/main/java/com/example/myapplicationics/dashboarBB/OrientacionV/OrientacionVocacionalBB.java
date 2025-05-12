package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityOrientacionVocacionalBbBinding;

public class OrientacionVocacionalBB extends AppCompatActivity {

    // Declarar el binding
    private ActivityOrientacionVocacionalBbBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityOrientacionVocacionalBbBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.startButtonTv.setOnClickListener(v -> {

            Intent intent = new Intent(this, TestVocacion_1.class);
            startActivity(intent);
        });
    }
}
