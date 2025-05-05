package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.bibliotecaV.MainActivity3victor;

public class MainActivity extends AppCompatActivity {
Button btn_Material;
Button btn_Registro;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        btn_Material=findViewById(R.id.btn_Material);
        
        
        btn_Material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irmaterial=new Intent(MainActivity.this, MainActivity3victor.class);
                startActivity(irmaterial);
                
            }
        });


        btn_Registro=findViewById(R.id.btn_Registro);


        btn_Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irRegistro=new Intent(MainActivity.this,RegistroLenny.class);
                startActivity(irRegistro);

            }
        });

        
    }
}