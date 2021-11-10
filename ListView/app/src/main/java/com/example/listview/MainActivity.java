package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] app = {"Facebook","Whatsapp","Instagram"};
    int [] appImages = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.instagram};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView slv = (ListView) findViewById(R.id.lv);

        List<HashMap<String,String>> li = new ArrayList<>();

        for (int i=0; i<app.length;i++)
        {
            HashMap<String,String> hm = new HashMap<>();
            hm.put("name",app[i]);
            hm.put("picture",appImages[i]+"");
            li.add(hm);
        }

        String[] from = {"name", "picture"};
        int [] to = {R.id.tv1,R.id.i1};

        SimpleAdapter sad = new SimpleAdapter(this,li,R.layout.layut_sa, from, to);
        slv.setAdapter(sad);
    }
}