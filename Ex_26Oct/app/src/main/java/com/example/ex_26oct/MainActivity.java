package com.example.ex_26oct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String [] brand = {"Nike","Adidas","Puma"};
    int [] brandImages = {R.drawable.nike, R.drawable.adidas, R.drawable.puma};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView slv = (ListView) findViewById(R.id.lv);

        List<HashMap<String,String>> li = new ArrayList<>();

        for (int i=0; i<brand.length;i++)
        {
            HashMap<String,String> hm = new HashMap<>();
            hm.put("name",brand[i]);
            hm.put("picture",brandImages[i]+"");
            li.add(hm);
        }

        String[] from = {"name", "picture"};
        int [] to = {R.id.tv1,R.id.i1};

        SimpleAdapter sad = new SimpleAdapter(this,li,R.layout.layout_sa, from, to);
        slv.setAdapter(sad);
    }

}