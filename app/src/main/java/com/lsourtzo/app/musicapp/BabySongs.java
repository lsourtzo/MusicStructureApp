package com.lsourtzo.app.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.Toast;

public class BabySongs extends AppCompatActivity {

    // Declare views
    ScrollView Message;
    Button closeMessage;
    Button returnToMain;
    CheckBox ChBox1;
    CheckBox ChBox2;
    CheckBox ChBox3;
    CheckBox ChBox4;
    CheckBox ChBox5;
    CheckBox ChBox6;
    CheckBox ChBox7;
    CheckBox ChBox8;
    CheckBox ChBox9;
    CheckBox ChBox10;
    CheckBox ChBox11;
    CheckBox ChBox12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_songs);

        // Declare views
        Message = (ScrollView) findViewById(R.id.disappearBox);
        closeMessage = (Button) findViewById(R.id.disappearButton);
        returnToMain = (Button) findViewById(R.id.returnToMainActivity);
        ChBox1 = (CheckBox) findViewById(R.id.LulaChBox1);
        ChBox2 = (CheckBox) findViewById(R.id.LulaChBox2);
        ChBox3 = (CheckBox) findViewById(R.id.LulaChBox3);
        ChBox4 = (CheckBox) findViewById(R.id.LulaChBox4);
        ChBox5 = (CheckBox) findViewById(R.id.LulaChBox5);
        ChBox6 = (CheckBox) findViewById(R.id.LulaChBox6);
        ChBox7 = (CheckBox) findViewById(R.id.LulaChBox7);
        ChBox8 = (CheckBox) findViewById(R.id.LulaChBox8);
        ChBox9 = (CheckBox) findViewById(R.id.LulaChBox9);
        ChBox10 = (CheckBox) findViewById(R.id.LulaChBox10);
        ChBox11 = (CheckBox) findViewById(R.id.LulaChBox11);
        ChBox12 = (CheckBox) findViewById(R.id.LulaChBox12);

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
                    Toast.makeText(BabySongs.this, getString(R.string.ToastNoNone), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean checkIfNoOne() {
        if (ChBox1.isChecked() || ChBox2.isChecked() || ChBox3.isChecked() || ChBox4.isChecked() || ChBox5.isChecked() || ChBox6.isChecked() || ChBox7.isChecked() || ChBox8.isChecked() || ChBox9.isChecked() || ChBox10.isChecked() || ChBox11.isChecked() || ChBox12.isChecked()) {
            return true;
        } else {
            return false;
        }

    }
}
