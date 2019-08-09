package com.example.c0751598_mad3125_midterm;

import java.util.ArrayList;

public class Users {

    String Email;
    String Password;


//    static  Users[] userArray;
    static ArrayList<Users> userArray = new ArrayList<Users>();

    public Users(String email, String password) {
        Email = email;
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
