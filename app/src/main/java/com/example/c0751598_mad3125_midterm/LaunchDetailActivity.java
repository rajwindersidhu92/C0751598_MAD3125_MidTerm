package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LaunchDetailActivity extends AppCompatActivity {

    TextView launch_Name ,launch_Year ,rocket_id, rocket_name,rocket_type;

    String launch_name1, launch_year1,rocket_id1 , rocket_name1 ,rocket_type1 ,image1, wiki1 ;

    private Button btnweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_detail);

        Intent intent = getIntent();
        launch_name1 = intent.getStringExtra("launch_name");
        launch_year1 = intent.getStringExtra("launch_year");
        rocket_id1 = intent.getStringExtra("rocket_id");
        rocket_name1 = intent.getStringExtra("rocket_name");
        rocket_type1 = intent.getStringExtra("rocket_type");
        image1 = intent.getStringExtra("image");
        wiki1 = intent.getStringExtra("wiki");
        init();
        setData();

        btnweb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(view.getContext(), WebViewActivity.class);
                intent.putExtra("wiki" ,wiki1 );

                view.getContext().startActivity(intent);
            }
        });



    }



    public void init() {
        launch_Name = (TextView) findViewById(R.id.launch_Name);
        launch_Year = (TextView) findViewById(R.id.launch_year);
        rocket_id = (TextView) findViewById(R.id.rocket_id);
        rocket_name = (TextView) findViewById(R.id.rocket_name);
        btnweb = findViewById(R.id.btn_web);
//        rocket_type = (TextView) findViewById(R.id.rocket_type);
    }

    public void setData() {
        launch_Name.setText(launch_name1);
        launch_Year.setText(launch_year1);
        rocket_id.setText(rocket_id1);
        rocket_name.setText(rocket_name1);
//        rocket_type.setText(rocket_type1);
//        rocket_name.setText(launchdetails.getRocket().getRocket_name());
    }
}