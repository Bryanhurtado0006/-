package com.example.myapplicationics.dashboarBB.MundosBB.bienvenida;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationics.R;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.Mundo;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.MundosAdapter;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.SpacingItemDecoration;



import java.util.ArrayList;
import java.util.List;

public class ListaMundosFragment extends Fragment {

    private RecyclerView recyclerView;
    private MundosAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mundos_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerMundos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.addItemDecoration(new SpacingItemDecoration(dpToPx(16)));

        List<Mundo> listaMundos = new ArrayList<>();
        listaMundos.add(new Mundo("Mundo de Matemáticas", R.drawable.mundouno));
        listaMundos.add(new Mundo("Mundo de Inglés", R.drawable.mundodos));
        listaMundos.add(new Mundo("Mundo de Español", R.drawable.mundotres));
        listaMundos.add(new Mundo("Mundo de Ciencias", R.drawable.mundocuatro));
        listaMundos.add(new Mundo("Mundo de Historia", R.drawable.mundocinco));

        adapter = new MundosAdapter(listaMundos);
        recyclerView.setAdapter(adapter);

        return view;
    }
    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
}

