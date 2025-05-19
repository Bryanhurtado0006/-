package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityTestVocacion1Binding;

public class TestVocacion_1 extends AppCompatActivity {

    private ActivityTestVocacion1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTestVocacion1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnNext.setOnClickListener(v -> {

            Intent intent = new Intent(this, TestVocacion_2.class);
            startActivity(intent);


        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}