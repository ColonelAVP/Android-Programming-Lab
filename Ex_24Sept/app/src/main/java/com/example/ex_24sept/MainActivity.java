package com.example.ex_24sept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.b1);
        Button btn2 = (Button)findViewById(R.id.b2);
        WebView wv1 = (WebView)findViewById(R.id.wv1);
        WebView wv2 = (WebView)findViewById(R.id.wv2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://www.amity.edu");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv2.loadUrl("https://github.com/");
            }
        });
    }
}