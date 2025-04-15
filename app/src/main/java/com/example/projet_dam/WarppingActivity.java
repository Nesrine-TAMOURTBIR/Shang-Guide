package com.example.projet_dam;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;

public class WarppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warpping);

        // Initialize all cards
        LinearLayout cardRestaurants = findViewById(R.id.card_restaurants);
        LinearLayout cardHotels = findViewById(R.id.card_hotels);
        LinearLayout cardGardens = findViewById(R.id.card_gardens);
        LinearLayout cardTourist = findViewById(R.id.card_tourist);

        // Set click listeners with null checks
        if (cardRestaurants != null) {
            cardRestaurants.setOnClickListener(v -> launchActivity(RestaurantsActivity.class));
        }
        if (cardHotels != null) {
            cardHotels.setOnClickListener(v -> launchActivity(HotelsActivity.class));
        }
        if (cardGardens != null) {
            cardGardens.setOnClickListener(v -> launchActivity(GardenActivity.class));
        }
        if (cardTourist != null) {
            cardTourist.setOnClickListener(v -> launchActivity(TouristPlacesActivity.class));
        }
    }

    private void launchActivity(Class<?> cls) {
        try {
            startActivity(new Intent(this, cls));
        } catch (Exception e) {
            e.printStackTrace();
            // Optional: Show Toast message on error
            // Toast.makeText(this, "Activity not found", Toast.LENGTH_SHORT).show();
        }
    }
}