package com.example.contador_para_entregar.Musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.contador_para_entregar.InformacionActivity;
import com.example.contador_para_entregar.OpticonsActivity;
import com.example.contador_para_entregar.R;


    public class MusicaActivity extends AppCompatActivity {

        Button buttonIE;
        Button buttonMonster;
        Button buttonLol;

        MediaPlayer player;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_musica);
            buttonIE = (Button) findViewById(R.id.ie);
            buttonMonster = (Button) findViewById(R.id.monster);
            buttonLol = (Button) findViewById(R.id.lol);

        }

        public void ie(View v) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.ieopg);
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopPlayer();
                    }
                });
            }

            player.start();
        }
        public void monster(View v) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.monsterhigh);
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopPlayer();
                    }
                });
            }

            player.start();
        }
        public void lol(View v) {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.paranoia);
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopPlayer();
                    }
                });
            }

            player.start();
        }
        public void pause(View v) {
            if (player != null) {
                player.pause();
            }
        }

        public void stop(View v) {
            stopPlayer();
        }

        private void stopPlayer() {
            if (player != null) {
                player.release();
                player = null;
                Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected void onStop() {
            super.onStop();
            stopPlayer();
        }

    }
