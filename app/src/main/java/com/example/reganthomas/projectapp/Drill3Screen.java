package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Drill3Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill3_screen);
    }

    public void Parts3 (View view){
        Intent a = new Intent(this, Parts3Screen.class);
        startActivity(a);
    }

    public void More3 (View view){
        Intent b = new Intent(this, D3PDFScreen.class);
        startActivity(b);
    }

    public void Back (View view){
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

    public void M1 (View view){
        Intent a = new Intent(this, D3S1PartScreen.class);
        startActivity(a);
    }

    public void M2 (View view){
        Intent a = new Intent(this, D3S2PartScreen.class);
        startActivity(a);
    }

    public void M3 (View view){
        Intent a = new Intent(this, D3S3PartScreen.class);
        startActivity(a);
    }

    public void M4 (View view){
        Intent a = new Intent(this, D3S4PartScreen.class);
        startActivity(a);
    }

    public void M5 (View view){
        Intent a = new Intent(this, D3S5PartScreen.class);
        startActivity(a);
    }

    public void M6 (View view){
        Intent a = new Intent(this, D3S6PartScreen.class);
        startActivity(a);
    }

    public void M7 (View view){
        Intent a = new Intent(this, D3S7PartScreen.class);
        startActivity(a);
    }

    public void M8 (View view){
        Intent a = new Intent(this, D3S8PartScreen.class);
        startActivity(a);
    }

    public void M9 (View view){
        Intent a = new Intent(this, D3S9PartScreen.class);
        startActivity(a);
    }
}
