package com.example.contador_para_entregar.MH.RecylcerMonsterHigh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contador_para_entregar.R;

import java.util.List;

public class MHAdapter extends RecyclerView.Adapter<MHAdapter.ViewHolder> {
    List<Monster> monsters;

    public MHAdapter(List<Monster> modelList){
        monsters = modelList;
    }
    @NonNull
    @Override
    public MHAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listamh, parent, false);
        return new MHAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MHAdapter.ViewHolder holder, int position) {
        holder.bind(monsters.get(position));
    }

    @Override
    public int getItemCount() {
        return monsters.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nombre;
        private final ImageView imagen;

        ViewHolder(View  v){
            super(v);
            nombre = v.findViewById(R.id.nomper);
            imagen = v.findViewById(R.id.imgper);

        }

        public void bind(Monster equipos) {
            nombre.setText(equipos.getNombre());
            imagen.setImageResource(equipos.getImagen());
        }
    }

}
