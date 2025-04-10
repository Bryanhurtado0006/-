package com.example.myapplicationics;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3victor extends AppCompatActivity {

Button btn_sociales,btn_naturales,btn_lectura,btn_matematicas,btn_ingles;


@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setContentView(R.layout.activity_main_activity3victor);
	
	btn_ingles=findViewById(R.id.btn_ingles);
	btn_lectura=findViewById(R.id.btn_Lectura_critica);
	btn_matematicas=findViewById(R.id.btn_Matematicas);
	btn_sociales=findViewById(R.id.btn_ciencias_sociales);
	btn_naturales=findViewById(R.id.btn_ciencias_naturales);
	
	
	
}
}