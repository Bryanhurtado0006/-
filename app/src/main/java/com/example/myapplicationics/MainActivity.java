package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplicationics.databinding.ActivityMainBinding;
import com.example.myapplicationics.iu.login.Daniel_Inicio_Sesion_General;
import com.example.myapplicationics.lenny_configuracion1.Lenny_Perfil;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnlenny.setOnClickListener(view ->{
            Intent intent = new Intent(this, Lenny_Perfil.class);
        });


    }
}
