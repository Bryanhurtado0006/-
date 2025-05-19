package com.example.myapplicationics.iu.login;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationics.R;
import com.example.myapplicationics.model.DbHelper;
import com.example.myapplicationics.ui.simulacroANA.Inicio_Simulacros;


public class Inicio_Sesion_Principal extends AppCompatActivity {

    private EditText etCorreo, etContrasena;
    private Button btnGuardar;
    private DbHelper dbHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion_principal);

        etCorreo = findViewById(R.id.et_correo_Daniel);
        etContrasena = findViewById(R.id.et_contraseña_Daniel);
        btnGuardar = findViewById(R.id.btnIrInicio);

        // 🔹 Navegación del TextView
        TextView tvRestablecer = findViewById(R.id.ed_restablecer_contraseña_Daniel);
        tvRestablecer.setOnClickListener(v -> {
            Intent intent = new Intent(this, Daniel_restablecer_contrasena_1.class);
            startActivity(intent);
        });

        dbHelper = new DbHelper(this);
        db = dbHelper.getWritableDatabase();

        // 🔹 Acción del botón: guarda en la base de datos y navega a Inicio_Simulacros
        btnGuardar.setOnClickListener(v -> {
            String correo = etCorreo.getText().toString();
            String contrasena = etContrasena.getText().toString();

            ContentValues values = new ContentValues();
            values.put(DbHelper.COL_CORREO, correo);
            values.put(DbHelper.COL_CONTRASENA, contrasena);

            db.insert(DbHelper.TABLE_USUARIOS, null, values);

            etCorreo.setText("");
            etContrasena.setText("");

            // Navegación a Inicio_Simulacros
            Intent intent = new Intent(this, Inicio_Simulacros.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (db != null && db.isOpen()) {
            db.close();
        }
    }
}
