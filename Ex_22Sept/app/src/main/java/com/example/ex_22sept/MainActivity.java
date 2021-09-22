package com.example.ex_22sept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rgg;
    TextView result;
    EditText editText;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgg = (RadioGroup)findViewById(R.id.rg);
        result = (TextView)findViewById(R.id.tv2);
        editText = (EditText)findViewById(R.id.ed1);
    }

    public void even_odd(View view) {
        if(!editText.getText().toString().isEmpty())
        {
            int rid = rgg.getCheckedRadioButtonId();
            rb=findViewById(rid);
            Toast.makeText(this, "Selected "+rb.getText(),Toast.LENGTH_LONG).show();
            int num = Integer.parseInt(editText.getText().toString());
            if(num%2==0)
            {
                result.setText(num+ " is Even Number");
            }
            else {
                result.setText(num+ " is Odd Number");
            }
        }
        else {
            result.setText("Please enter a valid number");
        }
    }

    public void factorial(View view) {
        if(!editText.getText().toString().isEmpty())
        {
            int rid = rgg.getCheckedRadioButtonId();
            rb=findViewById(rid);
            Toast.makeText(this, "Selected "+rb.getText(),Toast.LENGTH_LONG).show();
            int num = Integer.parseInt(editText.getText().toString());
            long factorial = 1;
            for(int i = 1; i <= num; ++i)
            {
                factorial *= i;
            }
            result.setText("Factorial of "+num+" is "+factorial);
        }
        else {
            result.setText("Please enter a valid number");
        }
    }
}