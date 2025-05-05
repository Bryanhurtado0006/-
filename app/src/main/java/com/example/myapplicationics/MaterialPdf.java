package com.example.myapplicationics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.bibliotecaV.MaterialIfecs;
import com.example.myapplicationics.databinding.ActivityMaterialPdfBinding;

public class MaterialPdf extends AppCompatActivity {

ActivityMaterialPdfBinding binding;

@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.activity_material_pdf);
	
	binding=ActivityMaterialPdfBinding.inflate(getLayoutInflater());
	setContentView(binding.getRoot());
	
	binding.btnIfecsPasados.setText("ir a ifecs");
	binding.btnIfecsPasados.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent ir_ifecs=new Intent(MaterialPdf.this, MaterialIfecs.class);
			startActivity(ir_ifecs);
			
		}
	});

}
}