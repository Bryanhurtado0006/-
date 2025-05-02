package com.example.myapplicationics.bibliotecaV;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;


public class MainActivity3victor extends AppCompatActivity {

ExtendedFloatingActionButton btnLectura,btn_Matematicas,btn_sociales,btn_naturales,btn_ingles;



@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setContentView(R.layout.activity_main_activity3victor);
	
	btnLectura=findViewById(R.id.btn_lectura);
	btn_Matematicas=findViewById(R.id.btn_matematicas);
	btn_sociales=findViewById(R.id.btn_sociales);
	btn_naturales=findViewById(R.id.btn_naturales);
	btn_ingles=findViewById(R.id.btn_ingles);
	
	btnLectura.setOnClickListener(v -> {
		String[] opciones = {"PDF", "VIDEO", "AUDIO VIDEO","LINK"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3victor.this);
		builder.setTitle("Elige una opción")
				.setItems(opciones, (dialog, which) -> {
					switch (which) {
						case 0:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 1:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 2:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						case 3:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						
					}
				});
		
		builder.show();
	});
	
	
	btn_Matematicas.setOnClickListener(v -> {
		String[] opciones = {"PDF", "VIDEO", "AUDIO VIDEO","LINK"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3victor.this);
		builder.setTitle("Elige una opción")
				.setItems(opciones, (dialog, which) -> {
					switch (which) {
						case 0:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 1:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 2:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						case 3:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						
					}
				});
		
		builder.show();
	});
	
	btn_naturales.setOnClickListener(v -> {
		String[] opciones = {"PDF", "VIDEO", "AUDIO VIDEO","LINK"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3victor.this);
		builder.setTitle("Elige una opción")
				.setItems(opciones, (dialog, which) -> {
					switch (which) {
						case 0:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 1:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 2:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						case 3:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						
					}
				});
		
		builder.show();
	});
	
	btn_sociales.setOnClickListener(v -> {
		String[] opciones = {"PDF", "VIDEO", "AUDIO VIDEO","LINK"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3victor.this);
		builder.setTitle("Elige una opción")
				.setItems(opciones, (dialog, which) -> {
					switch (which) {
						case 0:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 1:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 2:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						case 3:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						
					}
				});
		
		builder.show();
	});
	
	btn_ingles.setOnClickListener(v -> {
		String[] opciones = {"PDF", "VIDEO", "AUDIO VIDEO","LINK"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3victor.this);
		builder.setTitle("Elige una opción")
				.setItems(opciones, (dialog, which) -> {
					switch (which) {
						case 0:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 1:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						case 2:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						case 3:
							startActivity(new Intent(MainActivity3victor.this, MaterialIfecs.class));
							break;
						
						
					}
				});
		
		builder.show();
	});
	
	
	
	
	
}
}