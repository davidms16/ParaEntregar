package com.example.contador_para_entregar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.contador_para_entregar.PracticasGuiadas.MainActivity;

public class InformacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }
    public  void  volver(View v){
        //Esto va a ir a la otra pantalla
        Intent in = new Intent(this, PantallaActivity.class);
        startActivity(in);
        finish();
    }

    public void equipos(View v){
        Intent equi = new Intent(this, MainActivity.class);
        startActivity(equi);
    }
    public void personajes(View v){
        Intent per = new Intent(this, com.example.contador_para_entregar.PracticasGuiadas.ListView.MainActivity.class);
        startActivity(per);
    }

    }
