package com.chiruhas.android.debuggerdemo;

import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    BottomAppBar bottomAppBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        bottomAppBar = findViewById(R.id.nav);

        //very important line
        setSupportActionBar(bottomAppBar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Fab clicked",Snackbar.LENGTH_LONG).setAction("UNDO",null).show();
            }
        });

    }
    // inflating bottom app bar with icons


    @Override
    public boolean onCreateOptionsMenu(Menu me) {

        getMenuInflater().inflate(R.menu.menu_layout,me);
        return true;

    }
}
