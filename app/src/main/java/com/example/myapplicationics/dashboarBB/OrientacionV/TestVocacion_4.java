package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;
import com.example.myapplicationics.databinding.ActivityTestVocacion4Binding;
import com.example.myapplicationics.dashboarBB.MainActivity_pantallaP;

public class TestVocacion_4 extends AppCompatActivity {

    private ActivityTestVocacion4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTestVocacion4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnBackToHome.setOnClickListener(v -> {

            Intent intent = new Intent(this, MainActivity_pantallaP.class);


            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}