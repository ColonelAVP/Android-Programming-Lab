package com.example.assignment_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void utility(int funct) {
        EditText edd = (EditText) findViewById(R.id.ed1);
        TextView result = (TextView) findViewById(R.id.tv2);
        String s = edd.getText().toString();


        if(s.length()==0){
            edd.requestFocus();
            edd.setError("Field cannot be Empty");

        } // here we have applied the positive explosure.
        else if (!s.matches("[a-zA-Z ]+")){
            edd.requestFocus();
            edd.setError("Only Alphabet character is Allowed");
        }

        else if (funct==1) {
            result.setText("Length of String is " + s.length());
        }

        else if (funct==2) {
            result.setText("Trimmed String is " + s.trim());
        }

        else if (funct==3) {
            result.setText("Uppercase =" + s.toUpperCase());
        }

        else if (funct==4) {
            result.setText("lowercase = " + s.toLowerCase());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bb1 = (Button) findViewById(R.id.bt1);
        Button bb2 = (Button) findViewById(R.id.bt2);
        Button bb3 = (Button) findViewById(R.id.bt3);
        Button bb4 = (Button) findViewById(R.id.bt4);


        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utility(1);
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utility(2);

            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utility(3);
            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utility(4);
            }
        });

    }
}
