package com.example.ex_12nov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edd1 = (EditText) findViewById(R.id.ed1);
        EditText edd2 = (EditText) findViewById(R.id.ed2);
        Button saveButton = (Button) findViewById(R.id.btn1);
        Button readButton = (Button) findViewById(R.id.btn2);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}