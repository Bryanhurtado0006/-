package com.example.myapplicationics;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplicationics.databinding.ActivityMainActivitybryan3Binding;

public class MainActivitybryan3 extends AppCompatActivity {
    private ActivityMainActivitybryan3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainActivitybryan3Binding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());


    }
}