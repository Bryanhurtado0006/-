package com.example.myapplicationics;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplicationics.dashboarBB.MundosBB.MundosAdapter;

public class MundosActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private MundosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mundos);

        viewPager = findViewById(R.id.viewPagerMundos);
        adapter = new MundosAdapter(this);
        viewPager.setAdapter(adapter);


        viewPager.setPageTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {
                float scale = 0.85f + (1 - Math.abs(position)) * 0.15f;
                page.setScaleY(scale);
                page.setAlpha(0.5f + (1 - Math.abs(position)) * 0.5f);
            }
        });
    }
}


