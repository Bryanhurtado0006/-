package com.example.myapplicationics.lenny_configuracion1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.databinding.ActivityLennyPerfilBinding;

public class Lenny_Perfil extends AppCompatActivity {
    private ActivityLennyPerfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLennyPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.perfil.setOnClickListener(view ->{
            Intent intent = new Intent(Lenny_Perfil.this, Lenny_Editarperfil.class);
            startActivity(intent);
        });

        binding.btnVerPerfil.setOnClickListener(view -> {
            Intent intent = new Intent(Lenny_Perfil.this, Lenny_Verperfil.class);
            startActivity(intent);
        });

        binding.CerrarSesion.setOnClickListener(view -> {
            new AlertDialog.Builder(Lenny_Perfil.this)
                    .setTitle("Cerrar sesión")
                    .setMessage("¿Estás seguro de que quieres cerrar sesión?")
                    .setCancelable(false)
                    .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Lenny_Perfil.this, Lenny_Cerrarsesion.class);
                            startActivity(intent);
                            Toast.makeText(Lenny_Perfil.this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();
        });

        binding.Reporte.setOnClickListener(view -> {
            Intent intent = new Intent(Lenny_Perfil.this, Lenny_Reporte.class);
            startActivity(intent);
        });


        binding.Sugerencia.setOnClickListener(view -> {
            Intent intent = new Intent(Lenny_Perfil.this, Lenny_Sugerencias.class);
            startActivity(intent);
        });



    }
}
