package com.google.android.gms.samples.vision.face.facetracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.samples.vision.face.facetracker.Adapter.RecyclerAdapter;

/**
 * Created by anmol on 26/6/17.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager=new GridLayoutManager(MainActivity.this,2);
        rv.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(MainActivity.this);
        rv.setAdapter(adapter);
    }
}
