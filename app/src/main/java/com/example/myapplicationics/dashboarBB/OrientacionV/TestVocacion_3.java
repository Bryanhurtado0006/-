package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityTestVocacion3Binding;

public class TestVocacion_3 extends AppCompatActivity {

    private ActivityTestVocacion3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTestVocacion3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnNextVocaciion3.setOnClickListener(v -> {

            Intent intent = new Intent(this, TestVocacion_4.class);


            startActivity(intent);
            //overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}