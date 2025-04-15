package com.example.projet_dam;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private String description;
    private ArrayList<Integer> imageResourceIds;
    private String phone;
    private String email;

    public Hotel(String name, String description, ArrayList<Integer> imageResourceIds, String phone, String email) {
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
