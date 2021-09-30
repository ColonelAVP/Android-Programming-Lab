package com.example.ex_29sept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn1);
        EditText edd = (EditText) findViewById(R.id.ed1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edd.getText().toString();
                if(s.length() == 0){
                    edd.requestFocus();
                    edd.setError("Field Cannot be Empty");
                } else if (!s.matches("[a-zA-z]+")) {
                    edd.requestFocus();
                    edd.setError("Only Alphabetical Characters allowed");
                } else {
                    Toast.makeText(MainActivity.this, "Validation Successful", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}