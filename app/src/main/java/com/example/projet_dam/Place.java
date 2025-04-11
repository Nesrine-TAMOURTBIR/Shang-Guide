package com.example.projet_dam;


import java.util.ArrayList;

/*
public class TouristPlace {
    private String name;
    private String description;
    private ArrayList<Integer> imageResourceIds;
    private String phone;
    private String email;

    public TouristPlace(String name, String description, ArrayList<Integer> imageResourceIds, String phone, String email) {
        this.name = name;
        this.description = description;
        this.imageResourceIds = imageResourceIds;
        this.phone = phone;
        this.email = email;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<Integer> getImageResourceIds() { return imageResourceIds; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}
*/

import java.util.ArrayList;

public class Place {
    private String name;
    private String description;
    private ArrayList<Integer> imageResourceIds;
    private String phone;
    private String email;
    private String location;  // New attribute for location
    private String website;   // New attribute for website

    public Place(String name, String description, ArrayList<Integer> imageResourceIds, String phone, String email, String location, String website) {
        this.name = name;
        this.description = description;
        this.imageResourceIds = imageResourceIds;
        this.phone = phone;
        this.email = email;
        this.location = location;  // Initialize location
        this.website = website;    // Initialize website
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<Integer> getImageResourceIds() { return imageResourceIds; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getLocation() { return location; }
    public String getWebsite() { return website; }
}
