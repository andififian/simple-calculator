package com.example.project3post;

import androidx.appcompat.app.AppCompatActivity;
import static java.lang.Float.parseFloat;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    double a= 0,b = 0;
    private TextView display;
    boolean tambah, bagi, kali, kurang, mod, titik;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btambah,bkurang,bkali,bbagi,bmod,btitik,bclear,bhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.displayhasil);


        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        btambah = findViewById(R.id.buttontambah);
        bkurang = findViewById(R.id.buttonkurang);
        bbagi = findViewById(R.id.buttonbagi);
        bkali = findViewById(R.id.buttonkali);
        bmod = findViewById(R.id.buttonpersen);
        btitik = findViewById(R.id.buttontitik);
        bclear = findViewById(R.id.buttonclear);
        bhasil = findViewById(R.id.buttonhasil);

        b1.setOnClickListener(v -> {
            display.setText(display.getText() + "1");
        });

        b2.setOnClickListener(v -> {
            display.setText(display.getText() + "2");
        });

        b3.setOnClickListener(v -> {
            display.setText(display.getText() + "3");
        });

        b4.setOnClickListener(v -> {
            display.setText(display.getText() + "4");
        });

        b5.setOnClickListener(v -> {
            display.setText(display.getText() + "5");
        });

        b6.setOnClickListener(v -> {
            display.setText(display.getText() + "6");
        });

        b7.setOnClickListener(v -> {
            display.setText(display.getText() + "7");
        });

        b8.setOnClickListener(v -> {
            display.setText(display.getText() + "8");
        });

        b9.setOnClickListener(v -> {
            display.setText(display.getText() + "9");
        });

        b0.setOnClickListener(v -> {
            display.setText(display.getText() + "0");
        });

        btitik.setOnClickListener(v -> {
            if(titik){}
            else {
                display.setText(display.getText() + ".");
                titik = true;
            }
        });

        bclear.setOnClickListener(v -> {
            display.setText(null);
            a = 0;
            b = 0;
        });

        btambah.setOnClickListener(v -> {
            if(display.getText().length() != 0){
                a = parseFloat((String) display.getText());
                tambah = true;
                titik = false;
                display.setText(null);
            }
        });

        bbagi.setOnClickListener(v -> {
            if(display.getText().length() != 0){
                a = parseFloat((String) display.getText());
                bagi = true;
                titik = false;
                display.setText(null);
            }
        });

        bkali.setOnClickListener(v -> {
            if(display.getText().length() != 0){
                a = parseFloat((String) display.getText());
                kali = true;
                titik = false;
                display.setText(null);
            }
        });

        bmod.setOnClickListener(v -> {
            if(display.getText().length() != 0){
                a = parseFloat((String) display.getText());
                mod = true;
                titik = false;
                display.setText(null);
            }
        });

        bkurang.setOnClickListener(v -> {
            if(display.getText().length() != 0){
                a = parseFloat((String) display.getText());
                kurang = true;
                titik = false;
                display.setText(null);
            }
        });

        bhasil.setOnClickListener(v -> {
            hasil();
        });
    }

    public void hasil(){
        if(tambah || bagi || kali || kurang || mod){
            b = parseFloat((String) display.getText());
        }
        if(tambah){
            display.setText(a+b + "");
            tambah = false;
        }
        if(kurang){
            display.setText(a-b + "");
            kurang = false;
        }
        if(bagi){
            display.setText(a/b + "");
            bagi = false;
        }
        if(kali){
            display.setText(a*b + "");
            kali = false;
        }
        if(mod){
            display.setText(a%b + "");
            mod = false;
        }
    }
}