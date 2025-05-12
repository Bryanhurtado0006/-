package com.example.myapplicationics.lenny_configuracion1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityLennyReporteBinding;

public class Lenny_Reporte extends AppCompatActivity {

    private ActivityLennyReporteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLennyReporteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}