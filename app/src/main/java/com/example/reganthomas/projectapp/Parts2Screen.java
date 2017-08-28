package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Parts2Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts2_screen);
    }


    public void Sect1 (View view){
        Intent a = new Intent(this, D2S1PartScreen.class);
        startActivity(a);
    }

    public void Sect2 (View view){
        Intent b = new Intent(this, D2S2PartScreen.class);
        startActivity(b);
    }

    public void Sect3 (View view){
        Intent c = new Intent(this, D2S3PartScreen.class);
        startActivity(c);
    }

    public void Sect4 (View view){
        Intent d = new Intent(this, D2S4PartScreen.class);
        startActivity(d);
    }

    public void Sect5 (View view){
        Intent e = new Intent(this, D2S5PartScreen.class);
        startActivity(e);
    }

    public void Sect6 (View view){
        Intent f = new Intent(this, D2S6PartScreen.class);
        startActivity(f);
    }

    public void Sect7 (View view){
        Intent g = new Intent(this, D2S7PartScreen.class);
        startActivity(g);
    }

    public void Sect8 (View view){
        Intent h = new Intent(this, D2S8PartScreen.class);
        startActivity(h);
    }

    public void Sect9 (View view){
        Intent i = new Intent(this, D2S9PartScreen.class);
        startActivity(i);
    }

    public void Back (View view){
        Intent j = new Intent(this, DrillScreen.class);
        startActivity(j);
    }

    public void Full (View view){
        Intent k = new Intent(this, D2FullScreen.class);
        startActivity(k);
    }
}
