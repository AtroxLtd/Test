package com.example.reganthomas.projectapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();
        if (id == R.id.nav_drill) {
            Intent a = new Intent(this, DrillScreen.class);
            startActivity(a);
        } else if (id == R.id.nav_calc) {
            Intent b = new Intent(this, CalcScreen.class);
            startActivity(b);
        } else if (id == R.id.nav_news) {
            Intent c = new Intent(this, NewsScreen.class);
            startActivity(c);
        } else if (id == R.id.nav_photo) {
            Intent d = new Intent(this, CameraScreen.class);
            startActivity(d);
        }else if (id == R.id.nav_atrox) {
            Intent d = new Intent(this, AtroxScreen.class);
            startActivity(d);
        }else if (id == R.id.nav_settings) {
            Intent d = new Intent(this, SettingScreen.class);
            startActivity(d);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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
}
