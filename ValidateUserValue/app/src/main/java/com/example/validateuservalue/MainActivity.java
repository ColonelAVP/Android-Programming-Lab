package com.example.validateuservalue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = (EditText) findViewById(R.id.ed1);
        EditText password = (EditText) findViewById(R.id.ed2);
        Button submit = (Button) findViewById(R.id.b1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String User=username.getText().toString();
                final String Pass=password.getText().toString();
                if(User.length()==0)
                {
                    username.requestFocus();
                    username.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!User.matches("[a-zA-Z ]+"))
                {
                    username.requestFocus();
                    username.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if(Pass.length()==0)
                {
                    password.requestFocus();
                    password.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!Pass.matches("[a-zA-Z 0-9]+"))
                {
                    password.requestFocus();
                    password.setError("ENTER ONLY ALPHANUMERIC CHARACTER");
                }
                else if(Pass.length()<8)
                {
                    password.requestFocus();
                    password.setError("PASSWORD TOO SHORT");
                }
                else
                {
                    Toast.makeText(MainActivity.this,"LogIn Successful",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}