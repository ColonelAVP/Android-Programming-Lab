package com.example.ex_21sept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rgg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rgg = (RadioGroup)findViewById(R.id.rg);
    }

    public void Checked(View view){
        int rid = rgg.getCheckedRadioButtonId();
        rb = findViewById(rid);

        Toast.makeText( this, "Selected" + rb.getText(), Toast.LENGTH_LONG).show();
    }
}