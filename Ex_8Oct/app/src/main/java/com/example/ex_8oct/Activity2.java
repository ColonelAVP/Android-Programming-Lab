package com.example.ex_8oct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button bb = (Button)findViewById(R.id.b1);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                EditText txt = (EditText)findViewById(R.id.ed);
                data.setData(Uri.parse(txt.getText().toString()));
                setResult(RESULT_OK, data);
                finish();

            }
        });
    }
}