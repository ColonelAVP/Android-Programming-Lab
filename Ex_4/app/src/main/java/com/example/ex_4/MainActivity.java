package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String M = "Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void palindrome(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        EditText d = (EditText) findViewById(R.id.ed1);
        String n = d.getText().toString();
        i.putExtra(M, n);
        startActivity(i);
    }

    public void reverse(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity3.class);
        EditText d = (EditText) findViewById(R.id.ed1);
        String n = d.getText().toString();
        i.putExtra(M, n);
        startActivity(i);
    }
}