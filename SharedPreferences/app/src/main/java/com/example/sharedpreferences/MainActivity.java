package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MYPREFERENCES= "MyPref";
    public static final String ID = "idkey";
    public static final String Name = "namekey";
    public static final String Dept = "deptkey";
    public static final String Type = "typekey";
    public static final String Age= "nameage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1 = (EditText) findViewById(R.id.ed1);
        EditText ed2 = (EditText) findViewById(R.id.ed2);
        EditText ed3 = (EditText) findViewById(R.id.ed3);
        EditText ed4 = (EditText) findViewById(R.id.ed4);
        EditText ed5 = (EditText) findViewById(R.id.ed5);
        Button btn = (Button) findViewById(R.id.btn);
        SharedPreferences sharedPreferences = getSharedPreferences(MYPREFERENCES, MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = ed1.getText().toString();
                String n = ed2.getText().toString();
                String d = ed3.getText().toString();
                String t = ed4.getText().toString();
                String a = ed5.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(ID,i);
                editor.putString(Name,n);
                editor.putString(Dept,d);
                editor.putString(Type,t);
                editor.putString(Age,a);
                editor.commit();
                Toast.makeText(MainActivity.this, "Data Saved Succesfully",Toast.LENGTH_LONG).show();

            }
        });
    }
}
