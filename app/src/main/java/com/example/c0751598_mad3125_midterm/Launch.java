package com.example.c0751598_mad3125_midterm;

import java.io.Serializable;
import java.util.ArrayList;

public class Launch implements Serializable {

    private String launch_Name;
    private String launch_Year;
    private Rocket rocket;
    private LaunchLinks links;

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public LaunchLinks getLinks() {
        return links;
    }

    public void setLinks(LaunchLinks links) {
        this.links = links;
    }

    static ArrayList<Launch> LaunchList = new ArrayList<Launch>();

    public Launch(String launch_Name, String launch_Year ,String rocket_id ,
                  String rocket_name ,String rocket_type,String mission_patch,
                  String mission_patch_small, String wikipedia, String video_link) {
        this.launch_Name = launch_Name;
        this.launch_Year = launch_Year;
        this.rocket = new Rocket(rocket_id,  rocket_name,  rocket_type);
        this.links = new LaunchLinks( mission_patch,
                 mission_patch_small,  wikipedia,  video_link);
    }

    public String getLaunch_Name() {
        return launch_Name;
    }

    public void setLaunch_Name(String launch_Name) {
        this.launch_Name = launch_Name;
    }

    public String getLaunch_Year() {
        return launch_Year;
    }

    public void setLaunch_Year(String launch_Year) {
        this.launch_Year = launch_Year;
    }
}
