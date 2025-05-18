package com.example.myapplicationics.dashboarBB.MundosBB;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MundosAdapter extends FragmentStateAdapter {

    public MundosAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new fragment_matematico();
            case 1:
                return new fragment_laboratorio();
            case 2:
                return new fragment_english_arena();
            case 3:
                return new fragment_biblioteca();
            case 4:
                return new fragment_republica();
            default:
                return new fragment_matematico();  // fallback
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

