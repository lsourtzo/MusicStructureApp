package com.lsourtzo.app.musicapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.lsourtzo.app.musicapp.R.id.babyMusic;

public class MainActivity extends AppCompatActivity {

    // Declare views
    ScrollView Message;
    Button closeMessage;
    ImageView whiteNoises;
    ImageView babyMusic;
    ImageView settings;
    ImageView timer;
    ImageView playStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare views
        Message = (ScrollView) findViewById(R.id.disappearBox);
        closeMessage = (Button) findViewById(R.id.disappearButton);
        whiteNoises = (ImageView) findViewById(R.id.whiteNoises);
        babyMusic = (ImageView) findViewById(R.id.babyMusic);
        settings = (ImageView) findViewById(R.id.settings);
        timer = (ImageView) findViewById(R.id.timer);
        playStopButton = (ImageView) findViewById(R.id.playStopButton);

        // whiteNoises
        whiteNoises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whiteNoisesIntent = new Intent(MainActivity.this, WhiteNoises.class);
                startActivity(whiteNoisesIntent);
            }
        });

        // babyMusic
        babyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent babyMusicIntent = new Intent(MainActivity.this, BabySongs.class);
                startActivity(babyMusicIntent);
            }
        });

        // Setting
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        // Timer
        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent timerIntent = new Intent(MainActivity.this, TimerActivity.class);
                startActivity(timerIntent);
            }
        });

        // PlayStop
        playStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Close Message
        closeMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message.setVisibility(View.INVISIBLE);
            }
        });
    }

}
