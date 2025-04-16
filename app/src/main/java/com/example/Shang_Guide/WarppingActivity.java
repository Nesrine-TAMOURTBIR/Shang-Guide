package com.example.Shang_Guide;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WarppingActivity extends AppCompatActivity {

    private TextView discoverText;
    private TextView shanghaiText;
    private TextView languageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warpping);

        // Initialize title TextViews
        discoverText = findViewById(R.id.discover_text); // Add these IDs to your XML
        shanghaiText = findViewById(R.id.shanghai_text);
        languageText = findViewById(R.id.text_language);

        // Set initial text based on current language
        updateTitleText();
        LinearLayout languageSwitch = findViewById(R.id.language_switch);
        languageSwitch.setOnClickListener(v -> {
            String currentLang = LocaleHelper.getLanguage(this);
            String newLang = currentLang.equals("en") ? "ar" : "en";
            LocaleHelper.setLocale(this, newLang);
            updateTitleText(); // Update text immediately
            LocaleHelper.restartActivity(this, WarppingActivity.class);
        });

        // Adjust layout direction based on language
        String currentLang = LocaleHelper.getLanguage(this);
        if (currentLang.equals("ar")) {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        } else {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        }

        // Initialize all cards
        LinearLayout cardTourist = findViewById(R.id.card_tourist);
        LinearLayout cardRestaurants = findViewById(R.id.card_restaurants);
        LinearLayout cardHotels = findViewById(R.id.card_hotels);
        LinearLayout cardGardens = findViewById(R.id.card_gardens);


        // Set click listeners
        if (cardRestaurants != null) cardRestaurants.setOnClickListener(v -> launchActivity(RestaurantsActivity.class));
        if (cardHotels != null) cardHotels.setOnClickListener(v -> launchActivity(HotelsActivity.class));
        if (cardGardens != null) cardGardens.setOnClickListener(v -> launchActivity(GardenActivity.class));
        if (cardTourist != null) cardTourist.setOnClickListener(v -> launchActivity(TouristPlacesActivity.class));
    }

    private void updateTitleText() {
        String currentLang = LocaleHelper.getLanguage(this);
        if (currentLang.equals("ar")) {
            discoverText.setText("اكتشف");
            shanghaiText.setText("شنغهاي معنا!");
            languageText.setText("ع");
        } else {
            discoverText.setText("Discover");
            shanghaiText.setText("Shanghai With Us!");
            languageText.setText(getResources().getString(R.string.change_language)); // Correctly fetch the
        }}


            private void launchActivity(Class<?> cls) {
        try {
            startActivity(new Intent(this, cls));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}