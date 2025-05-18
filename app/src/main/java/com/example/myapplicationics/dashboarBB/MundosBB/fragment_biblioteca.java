package com.example.myapplicationics.dashboarBB.MundosBB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myapplicationics.R;

public class fragment_biblioteca extends Fragment {

    public fragment_biblioteca() {
        // Constructor vacío obligatorio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Aquí se enlaza con el layout XML
        return inflater.inflate(R.layout.fragment_biblioteca, container, false);
    }
}

