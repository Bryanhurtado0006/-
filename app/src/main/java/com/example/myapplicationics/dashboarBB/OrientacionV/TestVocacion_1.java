package com.example.myapplicationics.dashboarBB.OrientacionV;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.databinding.ActivityTestVocacion1Binding;

public class TestVocacion_1 extends AppCompatActivity {

    private ActivityTestVocacion1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Configuración del View Binding
        binding = ActivityTestVocacion1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Listener para el botón Siguiente
        binding.btnNext.setOnClickListener(v -> {
            // Validar selección de respuesta
            if (binding.rgOptions.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Por favor selecciona una opción", Toast.LENGTH_SHORT).show();
                return;
            }

            // Obtener la respuesta seleccionada
            int selectedId = binding.rgOptions.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = findViewById(selectedId);
            String respuesta = selectedRadioButton.getText().toString();

            // Guardar la respuesta si es necesario (SharedPreferences, ViewModel, etc.)
            // Ejemplo con SharedPreferences:
            /*
            SharedPreferences preferences = getSharedPreferences("TestVocacional", MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("respuesta_1_1", respuesta);
            editor.apply();
            */

            // Navegar al Test 2
            Intent intent = new Intent(this, TestVocacion_2.class);
            startActivity(intent);

            // Opcional: Animación de transición
            overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null; // Liberar memoria del binding
    }
}