package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationics.databinding.ActivityMaterialIfecsBinding;

public class MaterialIfecs extends AppCompatActivity {
ActivityMaterialIfecsBinding bing;
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.activity_material_ifecs);
	
	bing=ActivityMaterialIfecsBinding.inflate(getLayoutInflater());
	setContentView(bing.getRoot());
	
	bing.btnConsejos.setText("ir consejos");
	bing.btnConsejos.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent irConsejos=new Intent(MaterialIfecs.this,Consejos.class);
			startActivity(irConsejos);
			
		}
	});
	
}
}