package com.example.myapplicationics.Gamificacion_LUIS;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationics.R;

public class Ruleta_LUIS extends AppCompatActivity {

    private RuletaView ruletaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ruleta_luis);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ruletaView = findViewById(R.id.ruletaView);
        Button btnGirar = findViewById(R.id.btnGirar);

        btnGirar.setOnClickListener(v -> ruletaView.girarRuleta());
    }
}
