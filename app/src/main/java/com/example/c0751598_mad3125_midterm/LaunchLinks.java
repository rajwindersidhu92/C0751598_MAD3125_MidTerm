package com.example.c0751598_mad3125_midterm;

public class LaunchLinks {

    String mission_patch ;
    String mission_patch_small;
    String wikipedia;
    String video_link;

    public LaunchLinks(String mission_patch, String mission_patch_small, String wikipedia, String video_link) {
        this.mission_patch = mission_patch;
        this.mission_patch_small = mission_patch_small;
        this.wikipedia = wikipedia;
        this.video_link = video_link;
    }

    public String getMission_patch() {
        return mission_patch;
    }

    public void setMission_patch(String mission_patch) {
        this.mission_patch = mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }

    public void setMission_patch_small(String mission_patch_small) {
        this.mission_patch_small = mission_patch_small;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }
}
