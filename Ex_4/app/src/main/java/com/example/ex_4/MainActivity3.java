package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView r = (TextView) findViewById(R.id.result);
        Intent i2 = getIntent();
        String i1 = i2.getStringExtra(MainActivity.M);
        r.setText(reverse(i1));

    }

    public String reverse(String i1) {
        String rev="";
        for(int i=i1.length()-1;i>=0;i--){
            rev+=i1.charAt(i);
        }
        return rev;
    }

}
