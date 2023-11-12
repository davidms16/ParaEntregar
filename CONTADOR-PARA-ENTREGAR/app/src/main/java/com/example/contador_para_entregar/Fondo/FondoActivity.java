package com.example.contador_para_entregar.Fondo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.contador_para_entregar.OpticonsActivity;
import com.example.contador_para_entregar.R;

public class FondoActivity extends AppCompatActivity {
    ImageView imagen;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fondo);

        imagen = (ImageView) findViewById(R.id.img);
    }

    //CAMBIAR EL PULSADOR DE LA IMAGEN

    int [] imgs = {R.drawable.patata, R.drawable.zanahoria, R.drawable.trigo,
            R.drawable.calabaza, R.drawable.melon, R.drawable.cacao,
            R.drawable.remolacha
    };
    int cont = 0;
    public void cambiar(View v){
        imagen.setImageResource(imgs[cont]);
        cont++;
        if (cont >= imgs.length){
            cont=0;
        }
    }

    public  void  volver(View v){
        Intent in = new Intent(this, OpticonsActivity.class);
        startActivity(in);
        finish();
    }
}