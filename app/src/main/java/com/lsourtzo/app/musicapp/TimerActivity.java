package com.lsourtzo.app.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class TimerActivity extends AppCompatActivity {

    // Declare views
    ScrollView Message;
    Button closeMessage;
    Button returnToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        // Declare views
        Message = (ScrollView) findViewById(R.id.disappearBox);
        closeMessage = (Button) findViewById(R.id.disappearButton);
        returnToMain = (Button) findViewById(R.id.returnToMainActivity);

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
    }
}
