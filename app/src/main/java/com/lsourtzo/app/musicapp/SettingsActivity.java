package com.lsourtzo.app.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;

public class SettingsActivity extends AppCompatActivity {

    // Declare views
    ScrollView Message;
    RadioButton radioOn;
    RadioButton radioOff;
    Button returnToMain;
    Button closeMessage;
    LinearLayout onSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Declare views
        Message = (ScrollView) findViewById(R.id.disappearBox);
        radioOn = (RadioButton) findViewById(R.id.onRadioButton);
        radioOff = (RadioButton) findViewById(R.id.offRadioButton);
        returnToMain = (Button) findViewById(R.id.returnToMainActivity);
        closeMessage = (Button) findViewById(R.id.disappearButton);
        onSet = (LinearLayout) findViewById(R.id.onSettings);

        // Close Message
        closeMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message.setVisibility(View.INVISIBLE);
            }
        });

        // Return To Main Activity
        returnToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // If radio button Off pressed
        radioOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioOn.setChecked(false);
                onSet.setVisibility(view.INVISIBLE);

            }
        });

        // If radio button Off pressed
        radioOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioOff.setChecked(false);
                onSet.setVisibility(view.VISIBLE);

            }
        });
    }
}
