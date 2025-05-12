package com.example.myapplicationics.lenny_configuracion1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityLennyEditarperfilBinding;

public class Lenny_Editarperfil extends AppCompatActivity {

    private ActivityLennyEditarperfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLennyEditarperfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}