package com.example.contador_para_entregar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;

public class TradingHall extends AppCompatActivity {
    TextView numerocont;
    BigInteger num = BigInteger.ZERO;
    BigInteger valor = BigInteger.ONE;
    BigInteger costo = new BigInteger("10");
    Button AutoClick;
    Button Multiplicar;
    Button aumentar;

/*
    BigInteger num = BigInteger.ZERO;
    BigInteger valor = BigInteger.ONE;
    BigInteger costo = new BigInteger("100");
    BigInteger costo_multiplicacion = new BigInteger("1000");
    BigInteger mil = new BigInteger("1000");
    BigInteger millon = new BigInteger("1000000");
    BigInteger billon = new BigInteger("1000000000");
    //AutoClick
    BigInteger ACcost = new BigInteger("10");
    int automatico = 1;
    int auto = 1;

    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tradinghall);


        Intent intent = getIntent();
        //bundle datum = intent.getExtras();


        numerocont = (TextView) findViewById(R.id.puntosclicks);
        aumentar = (Button) findViewById(R.id.aumentar);

        //Recorger los datos

        Intent recoger = getIntent();
        num = new BigInteger(recoger.getExtras().getString("num",num.toString()));
        valor = new BigInteger(recoger.getExtras().getString("valor",valor.toString()));
        numerocont.setText("Tus puntos de Pasión y Amistad: " + num.toString());



       /*if (datum != null){
           //Datos que se recogeran de la base de datos interna del dispositivo.
           String numero = datum.getString("data");
           numerocont.setText("Tus puntos de Pasión y Amistad: " + numero);
           ocu.setText(numero); //Esto es para que pase en numero de que realmente se tiene.
           num = new BigInteger(numero);*/


           /*
           String valorT = datum.getString("valor");
           String costoT = datum.getString("costo");
           String AcostT = datum.getString("AClik");
           String cotoTM = datum.getString("costo_mu");



           BigInteger valor = new BigInteger(valorT);
           BigInteger costo = new BigInteger(costoT);
           BigInteger costoM = new BigInteger(cotoTM);
           int ACost = Integer.parseInt(AcostT);
           */
        aumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mejora();
                Intent resultado = new Intent();
                resultado.putExtra("num",num.toString());
                setResult(RESULT_OK,resultado);
                finish();
            }
        });
    }


    public void volver(View v){
        Intent intent = new Intent();
        intent.putExtra("num", num.toString());
        intent.putExtra("costo", costo.toString());
        setResult(RESULT_OK, intent);
        finish();
    }


    public void mejora() {
        if (num.compareTo(new BigInteger("10")) >= 0) {
            num = num.subtract(costo);
            valor = valor.add(new BigInteger("1"));
            costo = costo.add(new BigInteger("20"));
            aumentar.setText("Aumenta: " + costo);
        }
    }

    //END APP
}