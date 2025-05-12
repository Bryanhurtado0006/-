package com.example.myapplicationics.dashboarBB;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityMainPantallaPBinding;
import com.example.myapplicationics.dashboarBB.OrientacionV.TestVocacion_1;

public class MainActivity_pantallaP extends AppCompatActivity {

    private ActivityMainPantallaPBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainPantallaPBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Asignar el click listener al TextView
        binding.OrientacionV.setOnClickListener(v -> {
            Intent intent = new Intent(this, TestVocacion_1.class);
            startActivity(intent);


            overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });


        binding.imgbryanlapiz.setOnClickListener(v -> {
            Intent intent = new Intent(this, TestVocacion_1.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null; //Liberar memoria del binding
    }
}