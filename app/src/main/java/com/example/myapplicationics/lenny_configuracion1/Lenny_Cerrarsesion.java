package com.example.myapplicationics.lenny_configuracion1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityLennyCerrarsesionBinding;

public class Lenny_Cerrarsesion extends AppCompatActivity {

    private ActivityLennyCerrarsesionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = ActivityLennyCerrarsesionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}