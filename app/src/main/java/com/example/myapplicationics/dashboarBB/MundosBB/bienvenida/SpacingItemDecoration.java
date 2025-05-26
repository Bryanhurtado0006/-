package com.example.myapplicationics.dashboarBB.MundosBB.bienvenida;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int space;

    public SpacingItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view,
                               @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        // Aplica espacio abajo de cada ítem
        outRect.bottom = space;

        // También puedes aplicar espacio superior solo al primer ítem si quieres:
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = space;
        }
    }
}
