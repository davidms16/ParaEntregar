package com.example.contador_para_entregar.MH.RecylcerMonsterHigh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.contador_para_entregar.InformacionActivity;
import com.example.contador_para_entregar.MH.MonsterhighActivity;
import com.example.contador_para_entregar.PracticasGuiadas.EquipoAdarer;
import com.example.contador_para_entregar.PracticasGuiadas.Equipos;
import com.example.contador_para_entregar.R;

import java.util.Arrays;
import java.util.List;

public class MonsterHighRecycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_high_recycler);
        RecyclerView rv = (RecyclerView) findViewById(R.id.itemlist);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<Monster> l = Arrays.asList(
                new Monster("Clawdeen Wolf (G1)", R.drawable.cwg1),
                new Monster("Clawdeen Wolf (G2)", R.drawable.cwg2),
                new Monster("Draculaura (G1)", R.drawable.drag1),
                new Monster("Draculaura (G2)", R.drawable.drag2),
                new Monster("Frankie Stein (G1)", R.drawable.fsg1),
                new Monster("Frankie Stein (G2)", R.drawable.fsg2),
                new Monster("Cleo De Nilo (G1)", R.drawable.cng1),
                new Monster("Cleo De Nilo (G2)", R.drawable.cng2),
                new Monster("Lagoona Blue (G1)", R.drawable.lbg1),
                new Monster("Lagoona Blue (G2)", R.drawable.lbg2),
                new Monster("Ghoulia Yelps (G1)", R.drawable.gyg1),
                new Monster("Ghoulia Yelps (G2)", R.drawable.gyg2),
                new Monster("Abby (G1)", R.drawable.abg1),
                new Monster("Abby (G2)", R.drawable.abg2),
                new Monster("Catty Noir (G1)", R.drawable.ctng1),
                new Monster("Toralei Stripe(G1)", R.drawable.tgg1),
                new Monster("Toralei Stripe(G2)", R.drawable.tgg2),
                new Monster("Meowlody & Purrsephone(G1)", R.drawable.pmg1),
                new Monster("Purrsephone(G2)", R.drawable.pg2),
                new Monster("Meowlody(G2)", R.drawable.mg2)
        );
        rv.setAdapter(new MHAdapter(l));

    }

    public  void  atras(View v){
        Intent at = new Intent(this, MonsterhighActivity.class);
        startActivity(at);
        finish();
    }

}
