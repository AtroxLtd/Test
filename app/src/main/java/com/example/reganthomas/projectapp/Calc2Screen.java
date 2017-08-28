package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Calc2Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc2_screen);
    }

    public void Back (View view){
        Intent a = new Intent(this, CalcScreen.class);
        startActivity(a);
    }
}
