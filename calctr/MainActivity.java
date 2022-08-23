package com.example.cltr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.txt1);
        e2=findViewById(R.id.txt2);
        t=findViewById(R.id.txtv);


    }
    public void sum(View view) {
        float a=Float.parseFloat(String.valueOf(e1.getText()));
        float b=Float.parseFloat(String.valueOf(e2.getText()));
          float c=a+b;
          t.setText(Float.toString(c));

    }
    public void sub(View view) {float a=Float.parseFloat(String.valueOf(e1.getText()));
        float b=Float.parseFloat(String.valueOf(e2.getText()));
        float c=a-b;
        t.setText(Float.toString(c));

    }

    public void div(View view) {
        float a=Float.parseFloat(String.valueOf(e1.getText()));
        float b=Float.parseFloat(String.valueOf(e2.getText()));
        float c=a/b;
        t.setText(Float.toString(c));
    }


    public void multi(View view) {
        float a=Float.parseFloat(String.valueOf(e1.getText()));
        float b=Float.parseFloat(String.valueOf(e2.getText()));
        float c=a*b;
        t.setText(Float.toString(c));
    }


}