package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


//import android.support.v7.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String userJson = null;
        try {
            userJson = loadJSONFromAsset();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(userJson != null)
        {

            try
            {
                JSONArray mJSONArray = new JSONArray(userJson);
                for (int i = 0; i < mJSONArray.length(); i++)
                {
                    JSONObject mObject = mJSONArray.getJSONObject(i);
                    System.out.println("----------------");
                    System.out.println(mObject.get("mission_name"));
                    Log.d("DATA", mObject.toString());
                }
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
    }


    public String loadJSONFromAsset() throws JSONException {
        String json;
        try {
            InputStream is = getAssets().open("Data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }


//        System.out.println(json);

        return json;
    }
}
