package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText unm,psd;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unm=findViewById(R.id.unm);
        psd=findViewById(R.id.psd);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String p=psd.getText().toString();
                if(u.equals("midhun")&& p.equals("813881"))
                {
                    Toast.makeText(MainActivity.this, "login successfully", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "login faild", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}