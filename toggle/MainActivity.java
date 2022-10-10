package com.example.toggle1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int image[] ={R.drawable.brd3,R.drawable.brd2};
    int currentindex=0;
    Button btn;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        imgv=findViewById(R.id.imageView);
    }


    public void view(View view) {
        currentindex();
    }

    private void currentindex() {
        switch (currentindex){
            case 0:imgv.setImageResource(image[1]);
            currentindex=1;
            break;
            case  1: imgv.setImageResource(image[0]);
            currentindex=0;
        }
    }
}