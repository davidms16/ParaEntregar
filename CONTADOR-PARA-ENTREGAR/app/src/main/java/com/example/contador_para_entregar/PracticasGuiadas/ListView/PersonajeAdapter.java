package com.example.contador_para_entregar.PracticasGuiadas.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.contador_para_entregar.R;

import java.util.List;

public class PersonajeAdapter extends ArrayAdapter<Personajes> {
    public PersonajeAdapter(@NonNull Context context, int resource, @NonNull List<Personajes> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        Personajes personajes = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(this.getContext()).inflate(R.layout.listapersonaje, parent, false);
            ((ImageView) convertView.findViewById(R.id.imagenjugador)).setImageResource(personajes.getImagen());
            ((TextView) convertView.findViewById(R.id.nameandlastnamecharacter)).setText(personajes.getNombre());
            ((TextView) convertView.findViewById(R.id.textequipo)).setText(personajes.getEquipo());
        }

        return convertView;
    }
}
