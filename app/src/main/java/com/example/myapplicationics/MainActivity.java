package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn_Material;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        btn_Material=findViewById(R.id.btn_Material);
        
        
        btn_Material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irmaterial=new Intent(MainActivity.this,MainActivity3victor.class);
                startActivity(irmaterial);
                
            }
        });
        
        
    }
}