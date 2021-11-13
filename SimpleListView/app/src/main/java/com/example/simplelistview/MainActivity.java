package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String names[] = {"C", "C++", "Python", "Java", "Javascript", "COBOL", "Kotlin", "R"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvv = (ListView) findViewById(R.id.lv);
        ArrayAdapter ad = new ArrayAdapter(this, R.layout.mylist, R.id.tv, names);

        lvv.setAdapter(ad);

    }
}