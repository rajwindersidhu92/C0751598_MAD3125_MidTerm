package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        Users u1 = new Users("raj@gmail.com" ,"123456");
        Users u2 = new Users("neeraj@gmail.com" ,"123456");
        Users u3 = new Users("uday@gmail.com" ,"123456");
        Users u4 = new Users("ujwal@gmail.com" ,"123456");
        Users u5 = new Users("vipul@gmail.com" ,"123456");

        Users.userArray.add(u1);
        Users.userArray.add(u2);
        Users.userArray.add(u3);
        Users.userArray.add(u4);



        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


    }
}
