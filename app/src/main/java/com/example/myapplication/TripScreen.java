package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class TripScreen extends AppCompatActivity {

    ArrayList<Bus> buses;
    GridView gridView;
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_screen);

        gridView = findViewById(R.id.gridview_buses_trip);
        buses = new ArrayList<>();
        Bus bs1 = new Bus(111111, "123456");
        buses.add(bs1);
        buses.add(new Bus(222222, "3037485"));
        buses.add(new Bus(333333, "3037485"));
        buses.add(new Bus(444444, "3037485"));
        buses.add(new Bus(555555, "3037485"));
        buses.add(new Bus(666666, "3037485"));
        buses.add(new Bus(777777, "3037485"));
        buses.add(new Bus(888888, "3037485"));
        buses.add(new Bus(999999, "3037485"));
        buses.add(new Bus(999999, "3037485"));

        adapter = new GridAdapter(TripScreen.this, buses);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //todo - what next after click on current bus
                if(i==1) {
                    Intent intent = new Intent(TripScreen.this, Bus.class);
                    startActivity(intent);
                }
                else if(l==2)
                {
                    Intent intent = new Intent(TripScreen.this, Bus.class);
                    startActivity(intent);

                }
                Toast.makeText(TripScreen.this, (int) gridView.getItemIdAtPosition(i), Toast.LENGTH_SHORT).show();
            }
            });

        gridView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //todo - what happens when we long press on single bus
                return true;
            }
        });
    /*    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                    long arg3) {
                if(position==1) {
                    Intent intent = new Intent(TripScreen.this, Bus.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent = new Intent(TripScreen.this, Bus.class);
                    startActivity(intent);

                }
                Toast.makeText(TripScreen.this, (int) gridView.getItemIdAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    */
    }
}