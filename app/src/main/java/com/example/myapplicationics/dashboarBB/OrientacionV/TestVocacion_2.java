package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityTestVocacion2Binding;

public class TestVocacion_2 extends AppCompatActivity {

    private ActivityTestVocacion2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityTestVocacion2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnNextVocaciion2.setOnClickListener(v -> {
            /*// Validar selección
            if (binding.rgOptions21.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Por favor selecciona una opción", Toast.LENGTH_SHORT).show();
                return;
            }

            // Obtener respuesta seleccionada
            int selectedId = binding.rgOptions21.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(selectedId);
            String respuesta = selectedRadioButton.getText().toString();

            // Guardar respuesta (ejemplo con SharedPreferences)
            getSharedPreferences("TestVocacional", MODE_PRIVATE)
                    .edit()
                    .putString("respuesta_2_1", respuesta)
                    .apply();*/


            Intent intent = new Intent(this, TestVocacion_3.class);
            startActivity(intent);


            //overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}