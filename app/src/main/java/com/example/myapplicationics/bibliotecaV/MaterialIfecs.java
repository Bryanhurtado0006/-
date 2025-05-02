package com.example.myapplicationics.bibliotecaV;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.Consejos;
import com.example.myapplicationics.R;
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
			Intent irConsejos=new Intent(MaterialIfecs.this, Consejos.class);
			startActivity(irConsejos);
			
		}
	});
	
}
}