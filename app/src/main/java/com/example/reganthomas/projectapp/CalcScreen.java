package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalcScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_screen);
    }

    public void Back (View view){
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }

    public void Calc1 (View view){
        Intent b = new Intent(this, Calc1Screen.class);
        startActivity(b);
    }

    public void Calc2 (View view){
        Intent b = new Intent(this, Calc1Screen.class);
        startActivity(b);
    }

    public void Calc3 (View view){
        Intent b = new Intent(this, Calc1Screen.class);
        startActivity(b);
    }

    public void Calc4 (View view){
        Intent b = new Intent(this, Calc1Screen.class);
        startActivity(b);
    }

    public void Calc5 (View view){
        Intent b = new Intent(this, Calc1Screen.class);
        startActivity(b);
    }
}
