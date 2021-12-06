package com.example.enablebluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        Button button3 = (Button) findViewById(R.id.btn3);
        TextView text = (TextView) findViewById(R.id.tv1);

        BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bAdapter == null){
                    Toast.makeText(MainActivity.this, "Bluetooth not supported", Toast.LENGTH_LONG).show();

                }
                else {
                    if(!bAdapter.isEnabled()){
                        Intent bintent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivity(bintent);

                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bAdapter.disable();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bAdapter == null){
                    Toast.makeText(MainActivity.this, "Bluetooth not supported", Toast.LENGTH_LONG).show();

                }
                else {

                    final Set<BluetoothDevice> pairedDevices = bAdapter.getBondedDevices();
                    if(pairedDevices.size()>0){
                        for (BluetoothDevice device: pairedDevices)
                        {
                            String name = device.getName();
                            String Address = device.getAddress();

                            text.setText("Name of the Device "+name+ " address of the Device "+Address);
                        }
                    }
                }

            }
        });
    }
}
