package com.example.myapplicationics;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.navigation.NavigationView;

public class BryanPantallaP extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bryan_pantalla_p);


        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            String mensaje = (item.getItemId() == R.id.nav_home) ? "Inicio" :
                    (item.getItemId() == R.id.nav_profile) ? "Perfil" :
                            (item.getItemId() == R.id.nav_settings) ? "Configuraciones" :
                                    "Opción no reconocida";

            Toast.makeText(BryanPantallaP.this, mensaje, Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
            return true;
        });
    }
}
