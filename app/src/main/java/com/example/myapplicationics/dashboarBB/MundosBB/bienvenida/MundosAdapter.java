package com.example.myapplicationics.dashboarBB.MundosBB.bienvenida;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.MundosAdapter;
import com.example.myapplicationics.R;
import com.example.myapplicationics.dashboarBB.MundosBB.bienvenida.Mundo;

import java.util.List;

public class MundosAdapter extends RecyclerView.Adapter<MundosAdapter.MundoViewHolder> {

    private List<Mundo> mundos;

    public MundosAdapter(List<Mundo> mundos) {
        this.mundos = mundos;
    }

    @NonNull
    @Override
    public MundoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mundo, parent, false);
        return new MundoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MundoViewHolder holder, int position) {
        Mundo mundo = mundos.get(position);
        holder.txtNombreMundo1.setText(mundo.getNombre());
        holder.imgMundo1.setImageResource(mundo.getImagen());
    }

    @Override
    public int getItemCount() {
        return mundos.size();
    }

    static class MundoViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreMundo1;
        ImageView imgMundo1;

        public MundoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombreMundo1 = itemView.findViewById(R.id.txtMundo1);
            imgMundo1 = itemView.findViewById(R.id.imgMundo1);
        }
    }
}

