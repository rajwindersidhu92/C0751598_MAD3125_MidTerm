package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LaunchDetailActivity extends AppCompatActivity {

    TextView launch_Name ,launch_Year ,rocket_id, rocket_name,rocket_type;



    String launch_name1, launch_year1,rocket_id1 , rocket_name1 ,rocket_type1 ,image1, wiki1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_detail);

//        Intent intent = getIntent();
//        launch_name1 = intent.getStringExtra("launch_name");
//        launch_year1 = intent.getStringExtra("launch_year");
//        rocket_id1 = intent.getStringExtra("rocket_id");
//        rocket_name1 = intent.getStringExtra("rocket_name");
//        rocket_type1 = intent.getStringExtra("rocket_type");
//        image1 = intent.getStringExtra("image");
//        wiki1 = intent.getStringExtra("wiki");

    }

    public void init() {
        launch_Name = (TextView) findViewById(R.id.launch_Name);
        launch_Year = (TextView) findViewById(R.id.launch_year);
    }

    public void setData() {
//        launch_Name.setText(launch_name1);
//        launch_Year.setText(launch_year1);
//        rocket_name.setText(launchdetails.getRocket().getRocket_name());
    }
}