package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class HomeActivity extends AppCompatActivity {
    String key = "";
    String launch_name = "";
    String launch_year = "";
    public Launch[] launches;
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

                    launch_name = mObject.get("mission_name").toString();
                    launch_year = mObject.get("launch_year").toString();
                    String launch_date_unix = mObject.get("launch_date_unix").toString();
                    JSONObject rocketJson = mObject.getJSONObject("rocket");
                    String rocket_id = rocketJson.getString("rocket_id");
                    String rocket_Name = rocketJson.getString("rocket_name");
                    String rocket_Type = rocketJson.getString("rocket_type");

                    JSONObject linksJson = mObject.getJSONObject("links");
                    String mission_patch = linksJson.getString("mission_patch");
                    String mission_patch_small = linksJson.getString("mission_patch_small");
                    String wikipedia = linksJson.getString("wikipedia");
                    String video_link = linksJson.getString("video_link");

                    Launch myListData1 = new Launch(launch_name , launch_year, rocket_id , rocket_Name , rocket_Type,
                            mission_patch, mission_patch_small,  wikipedia,  video_link);

                    Launch.LaunchList.add(myListData1);
                    Log.d("DATA", mObject.toString());
                }
                launches = Launch.LaunchList.toArray(new Launch [Launch.LaunchList.size()]);

            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LaunchAdapter adapter = new LaunchAdapter(launches);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
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
        return json;
    }
}