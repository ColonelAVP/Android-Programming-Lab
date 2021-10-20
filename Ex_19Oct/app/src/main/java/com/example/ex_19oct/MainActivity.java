package com.example.ex_19oct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.tv2);
        SimpleDateFormat s = new SimpleDateFormat("yyyy.MM.dd 'And Current Time is' HH:mm");
        String d = s.format(new Date());
        t.setText(d);
    }
}