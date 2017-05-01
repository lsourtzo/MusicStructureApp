package com.lsourtzo.app.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;


public class WhiteNoises extends AppCompatActivity {

    // Declare views
    ScrollView Message;
    Button closeMessage;
    Button returnToMain;
    CheckBox ChBox1;
    CheckBox ChBox2;
    CheckBox ChBox3;
    CheckBox ChBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white_noises);

        // Declare views
        Message = (ScrollView) findViewById(R.id.disappearBox);
        closeMessage = (Button) findViewById(R.id.disappearButton);
        returnToMain = (Button) findViewById(R.id.returnToMainActivity);
        ChBox1 = (CheckBox) findViewById(R.id.fireCheckBox);
        ChBox2 = (CheckBox) findViewById(R.id.ForestCheckBox);
        ChBox3 = (CheckBox) findViewById(R.id.rainCheckBox);
        ChBox4 = (CheckBox) findViewById(R.id.wavesCheckBox);

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
                if (checkIfNoOne()) {
                    finish();
                } else {
                    Toast.makeText(WhiteNoises.this, getString(R.string.ToastNoNoneWN), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean checkIfNoOne() {
        if (ChBox1.isChecked() || ChBox2.isChecked() || ChBox3.isChecked() || ChBox4.isChecked()){
            return true;
        } else {
            return false;
        }

    }
}
