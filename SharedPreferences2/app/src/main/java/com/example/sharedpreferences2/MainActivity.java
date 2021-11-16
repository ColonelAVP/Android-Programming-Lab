package com.example.sharedpreferences2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n, a, p, d, e;
    Button button_save;
    SharedPreferences sharedPreferences;
    // So Create a shared preferences name and also create key name
    public static final String SHARED_PREF_NAME = "mypref";
    public static final String NAME = "name";
    public static final String ADDRESS = "address";
    public static final String PHONENO = "phoneno";
    public static final String DEPT = "dept";
    public static final String EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.ed1);
        a = findViewById(R.id.ed2);
        p = findViewById(R.id.ed3);
        d = findViewById(R.id.ed4);
        e = findViewById(R.id.ed5);
        button_save = findViewById(R.id.button_save);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String name = sharedPreferences.getString(NAME, null);
        if (name !=null){
            //if data is avilable so directly call on HomeActiviy...
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);

        }

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when click a button put data on Shared preferences..
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.putString(NAME,n.getText().toString());
                editor.putString(ADDRESS,a.getText().toString());
                editor.putString(PHONENO,p.getText().toString());
                editor.putString(DEPT,d.getText().toString());
                editor.putString(EMAIL,e.getText().toString());
                editor.apply();

                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this,"Data Displayed Successfully", Toast.LENGTH_LONG).show();

            }
        });
    }
}