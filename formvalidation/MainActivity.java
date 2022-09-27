package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText txt1,txt2,txt3;
    RadioButton r1,r2;
    RadioGroup gen;
    Switch s;
    CheckBox c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.e1);
        txt2=findViewById(R.id.e2);
        txt3=findViewById(R.id.ps);
        b=findViewById(R.id.btn);
        gen=findViewById(R.id.rg);
        r1=findViewById(R.id.rbtn1);
        r2=findViewById(R.id.rbtn2);
        s=findViewById(R.id.sch);
        c=findViewById(R.id.cbox);




    }



    public void button(View view) {
        if (validate()) {
            Toast.makeText(this, "All data is valid", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "some data is invalid", Toast.LENGTH_SHORT).show();



    }
}

    private boolean validate() {
        Boolean isValid = false;
        String fnm,lnm;
        fnm=txt1.getText().toString();
        lnm=txt2.getText().toString();

        if (fnm.equals("")) {
            Toast.makeText(this, "First name is empty", Toast.LENGTH_SHORT).show();
        } else if (lnm.equals("")) {
            Toast.makeText(this, "Last name is empty", Toast.LENGTH_SHORT).show();
        } else if (txt3.length() < 3) {
            Toast.makeText(this, "password must have three letters", Toast.LENGTH_SHORT).show();
        } else if (!r1.isChecked() && !r2.isChecked()) {
            Toast.makeText(this, "please chose gender", Toast.LENGTH_SHORT).show();
        } else if (!s.isChecked()) {
            Toast.makeText(this, "new member", Toast.LENGTH_SHORT).show();
        } else if (!c.isChecked()) {
            Toast.makeText(this, "please agree the terms and conditions", Toast.LENGTH_SHORT).show();
        }
        else {
            return isValid = true;
        }
        return isValid;
    }
}