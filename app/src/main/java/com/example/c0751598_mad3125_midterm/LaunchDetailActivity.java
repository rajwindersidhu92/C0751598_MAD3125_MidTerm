package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LaunchDetailActivity extends AppCompatActivity {

    TextView launch_Name ,launch_Year ,rocket_id, rocket_name,rocket_type;
    Launch launchdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_detail);
        launchdetails = (Launch) getIntent().getSerializableExtra("launchlist");
    }

    public void init() {
        launch_Name = (TextView) findViewById(R.id.launch_Name);
        launch_Year = (TextView) findViewById(R.id.launch_year);
        rocket_name = (TextView) findViewById(R.id.rocket_name);
    }
    public void setData() {
        launch_Name.setText(launchdetails.getLaunch_Name());
        launch_Year.setText(launchdetails.getLaunch_Year());
        rocket_name.setText(launchdetails.getRocket().getRocket_name());
    }
}