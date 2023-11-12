package com.example.contador_para_entregar.PracticasGuiadas.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.contador_para_entregar.InformacionActivity;
import com.example.contador_para_entregar.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        Personajes[] personajes = new Personajes[]{

                //PERSONAJES DE LA LIENA PRIMERA (Saga Mark)
                new Personajes("Mark Evans", "Raimon, Inazuma Japon", R.drawable.mark),
                new Personajes("Nathan Swift", "Raimon, Inazuma Japon", R.drawable.nathan),
                new Personajes("Shawn Froste", "Alpino, Inazuma Japon", R.drawable.shawn),
                new Personajes("Axel Blade", "Raimon, Inazuma Japon", R.drawable.axel),
                new Personajes("Aide Froste", "Alpino", R.drawable.aiden),
                new Personajes("Xavier Foster", "Inazuma Japon", R.drawable.xavier),
                new Personajes("Caleb Stonewall", "Inazuma Japon", R.drawable.caleb),
                new Personajes("Hurley Kane", "Raimon, Inazuma Japon", R.drawable.hurley),
                new Personajes("Byron Love", "Instituto Zeus, Dragones de fuego", R.drawable.byron),
                new Personajes("Claude Beacons", "Dragones de fuego", R.drawable.torchy),
                new Personajes("Hector Helio", "The Little Gigants", R.drawable.hector),
                new Personajes("Paolo Bianchi", "Orfeo", R.drawable.paolo),
                new Personajes("Bash Lancer", "Equipo Ogro", R.drawable.bash),

                //PERSONAJES DE LA LINEA GO (Saga Arion)
                new Personajes("Hakuryuu", "Luz Eterna, Resistencia Japón", R.drawable.hakuryuu),
                new Personajes("Davy Jones", "Cala Pirata, Resistencia Japón", R.drawable.davy),
                new Personajes("Quentin Cinquedea", "Dragon Link, Resistencia Japón", R.drawable.quentin),
                new Personajes("Njord Snio", "Alpino (Go), Resistencia Japón", R.drawable.njord),
                new Personajes("Bay Laurel", "Kirkwood (Go), Resistencia Jpaón", R.drawable.bay),
                new Personajes("Aitor Czador", "Raimon (Go)", R.drawable.aitor),
                new Personajes("Terry Archibald", "Earth Eleven", R.drawable.terry),
                new Personajes("Arion Sherwind", "Raimon (Go), Earth Eleven", R.drawable.arion),
                new Personajes("Sol Daystar", "Universal", R.drawable.sol),
                new Personajes("Victor Blade", "Raimon (Go), Earth Eleven", R.drawable.victor),
                new Personajes("Simeon Ayp", "Nun-Gen", R.drawable.simeon),
                new Personajes("Zanark Avalonic", "Chrono Stone", R.drawable.zanark),

                //PERSONAJES DE LA LINEA ARTERNATIVA (Saga Sonny)
                new Personajes("Sonny Wright", "Raimon Isla Remota (Ares)", R.drawable.sonny),

                //PERSONAJES DE LA NUEVA LINEA TEMPORAL (Saga Unmei)
                new Personajes("Unmei Sasanami", "Namurohara", R.drawable.unmei)
        };

        PersonajeAdapter adapter = new PersonajeAdapter(this, R.layout.listapersonaje, Arrays.asList(personajes));

      ListView listView = findViewById(R.id.list);
      listView.setAdapter(adapter = new PersonajeAdapter(this, R.layout.listapersonaje, Arrays.asList(personajes)));



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Personajes personajes = (Personajes) adapterView.getItemAtPosition(position);
        String nombre = personajes.getNombre();
        Toast.makeText(this, nombre, Toast.LENGTH_LONG).show();
    }

    public  void  atras(View v){
        Intent at = new Intent(this, InformacionActivity.class);
        startActivity(at);
    }
}
