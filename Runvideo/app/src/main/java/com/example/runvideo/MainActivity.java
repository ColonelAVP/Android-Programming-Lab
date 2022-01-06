package com.example.runvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.btn1);
        Button b2 = (Button) findViewById(R.id.btn2);
        VideoView vv = (VideoView) findViewById(R.id.vv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer rings = MediaPlayer.create(MainActivity.this,R.raw.myaud);
                rings.start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.myvid;
                Uri uri = Uri.parse(uriPath);
                vv.setVideoURI(uri);
                vv.start();

            }
        });
    }
}