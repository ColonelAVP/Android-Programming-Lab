package com.example.ex_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView r = (TextView) findViewById(R.id.result);
        Intent i2 = getIntent();
        String i1 = i2.getStringExtra(MainActivity.M);
        if (is_palindrome(i1)) {
            r.setText(i1 + " is palindrome");
        }
        else {
            r.setText(i1 + " is not palindrome");
        }

    }
    public boolean is_palindrome(String i1) {
        int low = 0;
        int high = i1.length()-1;
        while (low < high) {
            if (i1.toLowerCase().charAt(low) != i1.toLowerCase().charAt(high)) {
                return false;
            }
            else {
                low++;
                high--;
            }
        }
        return true;
    }

}