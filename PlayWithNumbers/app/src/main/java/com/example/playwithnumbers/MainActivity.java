package com.example.playwithnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    EditText number3;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.ed1);
        number2=(EditText) findViewById(R.id.ed2);
        number3=(EditText) findViewById(R.id.ed3);
        result = (TextView) findViewById(R.id.tv3);
    }

    public void maxnum(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int num3 = Integer.parseInt(number3.getText().toString());
        if(num1>=num2 && num1>=num3) {
            result.setText(num1 + " is the max. number");
        }
        else if (num2>=num1 && num2>=num3) {
            result.setText(num2 + " is the max. number");
        }
        else {
            result.setText(num3 + " is the max. number");
        }

    }
    public void shift(View view) {
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int num3 = Integer.parseInt(number3.getText().toString());
        result.setText(num3 +", " + num1 + ", " + num2);
    }
}