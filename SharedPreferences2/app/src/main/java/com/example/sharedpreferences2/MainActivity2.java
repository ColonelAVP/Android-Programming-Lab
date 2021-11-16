package com.example.sharedpreferences2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView name, address, phoneno, dept, email;
    Button button_logout;
    SharedPreferences sharedPreferences;
    public static final String SHARED_PREF_NAME = "mypref";
    public static final String NAME = "name";
    public static final String ADDRESS = "address";
    public static final String PHONENO = "phoneno";
    public static final String DEPT= "dept";
    public static final String EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        name = findViewById(R.id.tv1);
        address = findViewById(R.id.tv2);
        phoneno = findViewById(R.id.tv3);
        dept = findViewById(R.id.tv4);
        email = findViewById(R.id.tv5);
        button_logout = findViewById(R.id.button_logout);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String n = sharedPreferences.getString(NAME,null);
        String a = sharedPreferences.getString(ADDRESS,null);
        String p = sharedPreferences.getString(PHONENO,null);
        String d = sharedPreferences.getString(DEPT,null);
        String e = sharedPreferences.getString(EMAIL,null);

        if (n != null || a!= null || p != null || d != null || e != null){
            // So set the data on textview
            name.setText("Full Name - "+ n);
            address.setText("Address - "+ a);
            phoneno.setText("Phoneno - "+ p);
            dept.setText("Department - "+ d);
            email.setText("Email - "+ e);

        }


        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(MainActivity2.this, "Log out successfully",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}