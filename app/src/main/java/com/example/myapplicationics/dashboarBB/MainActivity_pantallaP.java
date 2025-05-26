package com.example.myapplicationics.dashboarBB;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myapplicationics.Gamificacion_LUIS.Ruleta_LUIS;
import com.example.myapplicationics.R;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.Mundos_activity;
import com.example.myapplicationics.dashboarBB.OrientacionV.bienvenida_test;
import com.example.myapplicationics.databinding.ActivityMainPantallaPBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity_pantallaP extends AppCompatActivity {



    private ActivityMainPantallaPBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        binding = ActivityMainPantallaPBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //DIRECION A ORIENTACION VOCACIONAL

        binding.imgbryanlapiz.setOnClickListener(v -> {
            Intent intent = new Intent(this, bienvenida_test.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });

        // direccion a los mundos gamificados

        binding.ImgMundosgami.setOnClickListener(v -> {
            Intent intent = new Intent(this, Mundos_activity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });

        //direccion a las gamificaciones semanales

        binding.ImgGamificacionsemanal.setOnClickListener(v -> {
            Intent intent = new Intent(this, Ruleta_LUIS.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });



    }







    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding=null;
}
}