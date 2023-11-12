package com.example.contador_para_entregar.PracticasGuiadas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contador_para_entregar.R;

import java.util.List;

public class EquipoAdarer extends RecyclerView.Adapter<EquipoAdarer.ViewHolder> {
    List<Equipos> equipos;

    public EquipoAdarer(List<Equipos> modelList){
        equipos = modelList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listaequipos, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(equipos.get(position));
    }

    @Override
    public int getItemCount() {
        return equipos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nombre;
        private final ImageView imagen;

        ViewHolder(View  v){
            super(v);
            nombre = v.findViewById(R.id.nomequipo);
            imagen = v.findViewById(R.id.equipoimg);

        }

        public void bind(Equipos equipos) {
            nombre.setText(equipos.getNombre());
            imagen.setImageResource(equipos.getImagen());
        }
    }

}