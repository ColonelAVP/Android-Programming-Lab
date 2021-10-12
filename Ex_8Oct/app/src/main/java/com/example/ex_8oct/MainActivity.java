package com.example.ex_8oct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_CODE_1 = 1;
    int request_Value =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(i, REQUEST_CODE_1);

            }
        });}

    @Override
    protected void onActivityResult(int requestCode, int ResultCode, Intent data) {
        super.onActivityResult(requestCode, ResultCode, data);
        if (requestCode == request_Value)
            if (ResultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(), Toast.LENGTH_LONG).show();

            }
    }


}
