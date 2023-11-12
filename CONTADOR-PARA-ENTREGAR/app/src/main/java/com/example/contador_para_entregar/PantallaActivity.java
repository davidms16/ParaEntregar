package com.example.contador_para_entregar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantallaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
    }

    public  void  jugar(View v){
        //Esto va a ir a la otra pantalla
        Intent jugar = new Intent(this, MainActivity.class);
        startActivity(jugar);
    }
    public  void  info(View v){
        Intent inf = new Intent(this, InformacionActivity.class);
        startActivity(inf);

    }

    public  void  opciones(View v){
        Intent op = new Intent(this, OpticonsActivity.class);
        startActivity(op);

    }
    public  void  salir(View v){
        System.exit(0);
        finishAffinity();

    }
}