package com.example.myapplicationics.iu.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityDanielRestablecerContrasena3Binding;

public class Daniel_restablecer_contrasena_3 extends AppCompatActivity {

    private ActivityDanielRestablecerContrasena3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDanielRestablecerContrasena3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRecuperarContrasena3Daniel.setOnClickListener(view -> {
            String nuevaContrasena = binding.edtNuevaContrasena.getText().toString().trim();

            if (nuevaContrasena.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa una nueva contraseña", Toast.LENGTH_SHORT).show();
            } else {

                Intent intent = new Intent(this, Inicio_Sesion_Principal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
