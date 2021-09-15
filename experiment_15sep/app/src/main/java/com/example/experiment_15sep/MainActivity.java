package com.example.experiment_15sep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bb1 = (Button) findViewById(R.id.b1);
        Button bb2 = (Button) findViewById(R.id.b2);
        Button bb3 = (Button) findViewById(R.id.b3);
        Button bb4 = (Button) findViewById(R.id.b4);

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edd1 = (EditText) findViewById(R.id.ed1);
                EditText edd2 = (EditText) findViewById(R.id.ed2);
                TextView tvv = (TextView)  findViewById(R.id.tv2);
                int n1 = Integer.parseInt(edd1.getText().toString());
                int n2 = Integer.parseInt(edd2.getText().toString());
                int sum = n1 + n2;
                tvv.setText(sum+ "");

            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edd1 = (EditText) findViewById(R.id.ed1);
                EditText edd2 = (EditText) findViewById(R.id.ed2);
                TextView tvv = (TextView)  findViewById(R.id.tv2);
                int n1 = Integer.parseInt(edd1.getText().toString());
                int n2 = Integer.parseInt(edd2.getText().toString());
                int minus = n1 - n2;
                tvv.setText(minus+ "");

            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edd1 = (EditText) findViewById(R.id.ed1);
                EditText edd2 = (EditText) findViewById(R.id.ed2);
                TextView tvv = (TextView)  findViewById(R.id.tv2);
                int n1 = Integer.parseInt(edd1.getText().toString());
                int n2 = Integer.parseInt(edd2.getText().toString());
                int multi = n1 * n2;
                tvv.setText(multi+ "");

            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edd1 = (EditText) findViewById(R.id.ed1);
                EditText edd2 = (EditText) findViewById(R.id.ed2);
                TextView tvv = (TextView)  findViewById(R.id.tv2);
                int n1 = Integer.parseInt(edd1.getText().toString());
                int n2 = Integer.parseInt(edd2.getText().toString());
                int div = n1 / n2;
                tvv.setText(div+ "");

            }
        });

    }
}