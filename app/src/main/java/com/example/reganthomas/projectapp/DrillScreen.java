package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrillScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_screen);
    }


    public void Drill1 (View view){
        Intent a = new Intent(this, Drill1Screen.class);
        startActivity(a);
    }

    public void Drill2 (View view){
        Intent b = new Intent(this, Drill2Screen.class);
        startActivity(b);
    }

    public void Drill3 (View view){
        Intent c = new Intent(this, Drill3Screen.class);
        startActivity(c);
    }

    public void Drill4 (View view){
        Intent d = new Intent(this, Drill1Screen.class);
        startActivity(d);
    }

    public void Drill5 (View view){
        Intent e = new Intent(this, Drill2Screen.class);
        startActivity(e);
    }

    public void Drill6 (View view){
        Intent f = new Intent(this, Drill3Screen.class);
        startActivity(f);
    }

    public void Back (View view){
        Intent f = new Intent(this, MainActivity.class);
        startActivity(f);
    }
}
