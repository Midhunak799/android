package com.example.gallery1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import com.example.GridAdapter;
import com.example.gallery1.R;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images={R.drawable.c,R.drawable.d,R.drawable.dh,R.drawable.dho,R.drawable.dhon,R.drawable.msd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.grid_view);

        GridAdapter gridAdapter=new GridAdapter(this,images);
        gridView.setAdapter(gridAdapter);


    }
}