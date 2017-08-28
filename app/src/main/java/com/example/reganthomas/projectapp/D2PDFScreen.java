package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class D2PDFScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2_pdfscreen);
    }

    public void Back (View view){
        Intent a = new Intent(this, Drill2Screen.class);
        startActivity(a);
    }
}
