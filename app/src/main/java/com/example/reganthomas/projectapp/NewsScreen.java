package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_screen);
    }

    public void Back (View view){
        Intent g = new Intent(this, MainActivity.class);
        startActivity(g);
    }

    public void News1 (View view){
        Intent g = new Intent(this, News1Screen.class);
        startActivity(g);
    }

    public void News2 (View view){
        Intent g = new Intent(this, News2Screen.class);
        startActivity(g);
    }

    public void News3 (View view){
        Intent g = new Intent(this, News3Screen.class);
        startActivity(g);
    }
}
