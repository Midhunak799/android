package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView fn,ln,gender;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fn=findViewById(R.id.tv1);
        ln=findViewById(R.id.tv2);
        gender=findViewById(R.id.tv3);
        btn=findViewById(R.id.btn1);


    }


    public void GetData(View view) {
        SharedPreferences sharedPref=getSharedPreferences("My_pref",MODE_PRIVATE);
        fn.setText("First Name= "+sharedPref.getString("fname",""));
        ln.setText("Last Name= "+sharedPref.getString("lname",""));
        gender.setText("Gender= "+sharedPref.getString("Gender",""));
    }
    }

