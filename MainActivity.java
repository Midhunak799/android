package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    RadioButton rb1,rb2;
    RadioGroup rgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.e1);
        ed2=findViewById(R.id.e2);
        rb1=findViewById(R.id.rbtn1);
        rb2=findViewById(R.id.rbtn2);
        rgp=findViewById(R.id.rg);

    }

    public void submit(View view) {
        regform();

    }

    private void regform() {
        SharedPreferences sharedPref=getSharedPreferences("My_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("fname",ed1.getText().toString());
        editor.putString("lname",ed2.getText().toString());

        String radiovalue="";
        switch (rgp.getCheckedRadioButtonId()){
            case R.id.rbtn1:radiovalue="MALE";
            break;
            case R.id.rbtn2:radiovalue="FEMALE";
            break;
        }
        editor.putString("Gender",radiovalue);
        editor.apply();
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }


}