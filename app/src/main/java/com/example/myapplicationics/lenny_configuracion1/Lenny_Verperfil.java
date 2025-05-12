package com.example.myapplicationics.lenny_configuracion1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityLennyPerfilBinding;
import com.example.myapplicationics.databinding.ActivityLennySugerenciasBinding;
import com.example.myapplicationics.databinding.ActivityLennyVerperfilBinding;

public class Lenny_Verperfil extends AppCompatActivity {
    private ActivityLennyVerperfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLennyVerperfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}