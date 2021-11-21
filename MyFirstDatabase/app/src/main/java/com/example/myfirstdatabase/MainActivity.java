package com.example.myfirstdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText name, dob, bg;
    private Button submit;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing all our variables.
        name = findViewById(R.id.ed2);
        dob = findViewById(R.id.ed3);
        bg = findViewById(R.id.ed4);
        submit = findViewById(R.id.b1);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity.this);

        // below line is to add on click listener for our add course button.
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String studentName = name.getText().toString();
                String studentDOB = dob.getText().toString();
                String studentBloodgroup = bg.getText().toString();

                // validating if the text fields are empty or not.
                if (studentName.isEmpty() && studentDOB.isEmpty() && studentBloodgroup.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewStudent(studentName, studentDOB, studentBloodgroup);

                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Student has been added.", Toast.LENGTH_SHORT).show();
                name.setText("");
                dob.setText("");
                bg.setText("");
            }
        });

    }
}