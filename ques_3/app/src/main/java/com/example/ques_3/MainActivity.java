package com.example.ques_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bb = (Button) findViewById(R.id.b1);
    }

    public void Click(View view){
        Toast.makeText( this, "Testing Toast Widget", Toast.LENGTH_LONG).show();
    }
}