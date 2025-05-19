package com.example.myapplicationics.dashboarBB;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myapplicationics.Gamificacion_LUIS.Ruleta_LUIS;
import com.example.myapplicationics.Gamificacion_LUIS.Ruleta_View_Luis;
import com.example.myapplicationics.R;
import com.example.myapplicationics.dashboarBB.OrientacionV.OrientacionVocacionalBB;
import com.example.myapplicationics.databinding.ActivityMainPantallaPBinding;
import com.example.myapplicationics.dashboarBB.OrientacionV.TestVocacion_1;
import com.example.myapplicationics.databinding.ActivityMundosCompetenciaBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity_pantallaP extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    private ActivityMainPantallaPBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toolbar = findViewById(R.id.toolbar);
        //drawerLayout = findViewById(R.id.drawer_layout);
        //navigationView = findViewById(R.id.nav_view);

        /*setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        View headerView = navigationView.getHeaderView(0);
        TextView headerTitle = headerView.findViewById(R.id.header_title);
        headerTitle.setText("Bienvenido al Panel");*/

        /*navigationView.setNavigationItemSelectedListener(item -> {
            String mensaje = (item.getItemId() == R.id.nav_home) ? "Inicio" :
                    (item.getItemId() == R.id.nav_profile) ? "Perfil" :
                            (item.getItemId() == R.id.nav_settings) ? "Configuraciones" :
                                    (item.getItemId() == R.id.nav_notifications) ? "Notificaciones" :
                                            (item.getItemId() == R.id.nav_help) ? "Ayuda" :
                                                    "Opción no reconocida";


            Toast.makeText(MainActivity_pantallaP.this, mensaje, Toast.LENGTH_SHORT).show();
            drawerLayout.closeDrawers();
            return true;
        });*/


        binding = ActivityMainPantallaPBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //DIRECION A ORIENTACION VOCACIONAL

        binding.OrientacionV.setOnClickListener(v -> {
            Intent intent = new Intent(this, OrientacionVocacionalBB.class);
            startActivity(intent);
            //overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });

        // direccion a los mundos gamificados

        binding.ImgMundosgami.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityMundosCompetenciaBinding.class);
            startActivity(intent);
            //overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });

        //direccion a las gamificaciones semanales

        binding.ImgGamificacionsemanal.setOnClickListener(v -> {
            Intent intent = new Intent(this, Ruleta_LUIS.class);
            startActivity(intent);
           // overridePendingTransition(R.anim.slide_in_right_testv, R.anim.slide_out_left_testv);
        });



    }







    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding=null;
}
}