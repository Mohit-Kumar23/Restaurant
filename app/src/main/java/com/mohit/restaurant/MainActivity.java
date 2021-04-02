package com.mohit.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] rest_name={"Restaurant Dharshan","Restaurant Himalaya","Restaurant Honest","Restaurant Space","Restaurant Bipahsa"};
        String[] location = {"Vadoara","Ahmedabad","Delhi","Banglore","Chennai"};
        String[] sp_food={"Gujarati food,Punjabi food","Chinese_food","Gujarati Thali","Pizza,Burger","South Indian"};
        String[] timing={"24hrs","6am-11am","24hrs","8am-12am","10am-9pm"};
        int[] image_id={R.drawable.punjabi_food,
                        R.drawable.chinese_food,
                        R.drawable.gujrati_food,
                        R.drawable.pizza_food,
                        R.drawable.south_indian_food};

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView_layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(rest_name,location,timing,sp_food,image_id,getApplicationContext());
        recyclerView.setAdapter(mAdapter);
    }
}