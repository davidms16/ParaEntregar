package com.example.contador_para_entregar.PracticasGuiadas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.contador_para_entregar.InformacionActivity;
import com.example.contador_para_entregar.PantallaActivity;
import com.example.contador_para_entregar.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView rv = (RecyclerView) findViewById(R.id.itemlist);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<Equipos> l = Arrays.asList(
                new Equipos("Alpino", R.drawable.alpino),
                new Equipos("Royal Academy", R.drawable.royalacademy),
                new Equipos("Raimon", R.drawable.raimon),
                new Equipos("Luz Eterna", R.drawable.luz),
                new Equipos("Inazuma Battel Eleven", R.drawable.battle),
                new Equipos("Inazuma Best Eleven", R.drawable.best),
                new Equipos("Equipo Zero", R.drawable.zero),
                new Equipos("Equipo Ogre", R.drawable.ogro),
                new Equipos("Instituto Zeus", R.drawable.zeus),
                new Equipos("Instituto Universal", R.drawable.universal),
                new Equipos("Resistencia de Japon", R.drawable.resistencia),
                new Equipos("Dragones de Fuego", R.drawable.dragon),
                new Equipos("Namuhara", R.drawable.nagumohara),
                new Equipos("Earth Eleven", R.drawable.earth),
                new Equipos("Inazuma Japon", R.drawable.inazuma_japon),
                new Equipos("The Little Gigants", R.drawable.little_gigants),
                new Equipos("Instituto Occult", R.drawable.occult),
                new Equipos("Unicorn", R.drawable.unicorn),
                new Equipos("Aullido Lunar", R.drawable.aullido)
        );
        rv.setAdapter(new EquipoAdarer(l));

    }

    public  void  atras(View v){
        Intent at = new Intent(this, InformacionActivity.class);
        startActivity(at);
    }



}