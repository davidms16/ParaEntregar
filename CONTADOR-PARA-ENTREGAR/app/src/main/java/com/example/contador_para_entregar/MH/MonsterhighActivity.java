package com.example.contador_para_entregar.MH;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.contador_para_entregar.MH.RecylcerMonsterHigh.MonsterHighRecycler;
import com.example.contador_para_entregar.OpticonsActivity;
import com.example.contador_para_entregar.PantallaActivity;
import com.example.contador_para_entregar.R;

public class MonsterhighActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsterhigh);
    }

    public  void  volver(View v){
        Intent in = new Intent(this, OpticonsActivity.class);
        startActivity(in);
        finish();
    }

    public void mhlista(View v){
        Intent mh = new Intent(this, MonsterHighRecycler.class);
        startActivity(mh);
    }
}