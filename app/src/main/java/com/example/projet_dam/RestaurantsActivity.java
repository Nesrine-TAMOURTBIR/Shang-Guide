package com.example.projet_dam;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import com.example.projet_dam.PlaceAdapter;
import android.content.res.Resources;
import android.widget.TextView;

import com.example.projet_dam.R;


public class RestaurantsActivity extends AppCompatActivity {
    private ArrayList<Place> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_places);


        LinearLayout languageSwitch = findViewById(R.id.language_switch);
        languageSwitch.setOnClickListener(v -> {
            String currentLang = LocaleHelper.getLanguage(this);
            String newLang = currentLang.equals("en") ? "ar" : "en";
            LocaleHelper.setLocale(this, newLang);
            LocaleHelper.restartActivity(this, RestaurantsActivity.class);  // or your activity
        });


        // Adjust layout direction based on language
        String currentLang = LocaleHelper.getLanguage(this);
        if (currentLang.equals("ar")) {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        } else {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }



        placesList = new ArrayList<>();

        // 1)  Ultraviolet by Paul Pairet - 3 images
        ArrayList<Integer> UltravioletImages = new ArrayList<>();
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet1);
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet3);
        UltravioletImages.add(R.drawable.ultraviolet_by_paul_pairet2);

        placesList.add(new Place(
                getResources().getString(R.string.ultraviolet_title),
                getResources().getString(R.string.ultraviolet_description),
                UltravioletImages,
                "+86 21 6323 9898",
                "reservations@uvbypp.cc",
                getResources().getString(R.string.ultraviolet_address),
                "www.uvbypp.cc"));



        // 2)  Fu 1088 - 3 images
        ArrayList<Integer> fu1088Images = new ArrayList<>();
        fu1088Images.add(R.drawable.fu1088n5);
        fu1088Images.add(R.drawable.fu1088n1);
        fu1088Images.add(R.drawable.fu1088n2);
        fu1088Images.add(R.drawable.fu1088n3);
        fu1088Images.add(R.drawable.fu1088n4);


        placesList.add(new Place(
                getResources().getString(R.string.fu1088_title),
                getResources().getString(R.string.fu1088_description),
                fu1088Images,
                "+86 21 6247 6678",
                "reservations@fu1088.com",
                getResources().getString(R.string.fu1088_address),
                "www.fu1088.com"));



        // 3)  Polux by Paul Pairet - 6 images
        ArrayList<Integer> poluxImages = new ArrayList<>();
        poluxImages.add(R.drawable.polux1);
        poluxImages.add(R.drawable.polux2);
        poluxImages.add(R.drawable.polux3);
        poluxImages.add(R.drawable.polux4);
        poluxImages.add(R.drawable.polux5);
        poluxImages.add(R.drawable.polux6);


        placesList.add(new Place( getResources().getString(R.string.polux_title),
                getResources().getString(R.string.polux_description),
                poluxImages, // Your image array
                "+86 21 5383 5757",
                "reservations@polux.cn",
                getResources().getString(R.string.polux_address),
                "www.polux-china.com"));


        // 4)  Lü Bo Lang - 6 images
        ArrayList<Integer> lubolangImages = new ArrayList<>();
        lubolangImages.add(R.drawable.lubolang1);
        lubolangImages.add(R.drawable.lubolang2);
        lubolangImages.add(R.drawable.lubolang6);
        lubolangImages.add(R.drawable.lubolang5);
        lubolangImages.add(R.drawable.lubolang3);
        lubolangImages.add(R.drawable.lubolang4);


        placesList.add(new Place( getResources().getString(R.string.lubolang_title),
                getResources().getString(R.string.lubolang_description),
                lubolangImages,
                "+86 21 6328 0602",
                getResources().getString(R.string.lubolang_address),
                "115 Yuyuan Road",
                ""));


        // 5)  ROOF - 6 images
        ArrayList<Integer> roofImages = new ArrayList<>();
        roofImages.add(R.drawable.roof1);
        roofImages.add(R.drawable.roof2);
        roofImages.add(R.drawable.roof3);
        roofImages.add(R.drawable.roof4);
        roofImages.add(R.drawable.roof5);
        roofImages.add(R.drawable.roof6);

        placesList.add(new Place( getResources().getString(R.string.roof_title),
                getResources().getString(R.string.roof_description),
                roofImages,
                "+86 21 5368 9999",
                "dining.shanghai@editionhotels.com",
                getResources().getString(R.string.roof_address),
                "www.editionhotels.com/shanghai/roof"));

        // 6)  Yi Cafe - 5 images
        ArrayList<Integer> yicafeImages = new ArrayList<>();
        yicafeImages.add(R.drawable.yicafe4);
        yicafeImages.add(R.drawable.yicafe5);
        yicafeImages.add(R.drawable.yicafe2);
        yicafeImages.add(R.drawable.yicafe1);
        yicafeImages.add(R.drawable.yicafe3);

        placesList.add(new Place(getResources().getString(R.string.yicafe_title),
                getResources().getString(R.string.yicafe_description),
                yicafeImages,
                "+86 21 6882 8888",
                "dining@thepuli.com",
                getResources().getString(R.string.yicafe_address),
                "www.thepuli.com/dining"));

        // 7)  Xin Guang - 5 images
        ArrayList<Integer> xinguangImages = new ArrayList<>();
        xinguangImages.add(R.drawable.xin_guang7);
        xinguangImages.add(R.drawable.xin_guang6);
        xinguangImages.add(R.drawable.xin_guang2);
        xinguangImages.add(R.drawable.xin_guang1);
        xinguangImages.add(R.drawable.xin_guang3);

        placesList.add(new Place(getResources().getString(R.string.xinguang_title),
                getResources().getString(R.string.xinguang_description),
                xinguangImages,
                "+86 21 6322 3978",
                "No email",
                getResources().getString(R.string.xinguang_address),
                "None"));

        // 8)  SongYue Lou - 5 images
        ArrayList<Integer> songyuelouImages = new ArrayList<>();
        songyuelouImages.add(R.drawable.songyuelou1);
        songyuelouImages.add(R.drawable.songyuelou2);
        songyuelouImages.add(R.drawable.songyuelou3);
        songyuelouImages.add(R.drawable.songyuelou4);
        songyuelouImages.add(R.drawable.songyuelou5);
        // songyuelouImages.add(R.drawable.songyuelou6);
        songyuelouImages.add(R.drawable.songyuelou7);
        songyuelouImages.add(R.drawable.songyuelou8);
        songyuelouImages.add(R.drawable.songyuelou9);

        placesList.add(new Place(getResources().getString(R.string.songyuelou_title),
                getResources().getString(R.string.songyuelou_description),
                songyuelouImages,
                "+86 21 6355 3630",
                "",
                getResources().getString(R.string.songyuelou_address),
                ""));

        /*

        // Display the places in a ListView
        ArrayList<String> placeNames = new ArrayList<>();
        for (Place place : placesList) {
            placeNames.add(place.getName());
        }

        ListView listView = findViewById(R.id.listViewTouristPlaces);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, placeNames);
        listView.setAdapter(adapter);

        // Handle clicks on list items
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Place selectedPlace = placesList.get(position);

            if (selectedPlace == null) {
                System.out.println("Error: selectedPlace is null!");
                return;
            }

            Intent intent = new Intent(RestaurantsActivity.this, DescriptionActivity.class);
            intent.putExtra("name", selectedPlace.getName());
            intent.putExtra("description", selectedPlace.getDescription());

            // تأكد أن الصور ليست null
            if (selectedPlace.getImageResourceIds() != null) {
                intent.putIntegerArrayListExtra("images", selectedPlace.getImageResourceIds());
            }

            intent.putExtra("phone", selectedPlace.getPhone());
            intent.putExtra("email", selectedPlace.getEmail());

            startActivity(intent);
        });

    }
}


         */
// Display the places in a ListView
        ListView listView = findViewById(R.id.listViewTouristPlaces);
        PlaceAdapter adapter = new PlaceAdapter(this, placesList);
        listView.setAdapter(adapter);

// Handle clicks on list items
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Place selectedPlace = placesList.get(position);

            if (selectedPlace == null) {
                System.out.println("Error: selectedPlace is null!");
                return;
            }

            Intent intent = new Intent(RestaurantsActivity.this, DescriptionActivity.class);
            intent.putExtra("name", selectedPlace.getName());
            intent.putExtra("description", selectedPlace.getDescription());

            // Ensure the images are not null
            if (selectedPlace.getImageResourceIds() != null) {
                intent.putIntegerArrayListExtra("images", selectedPlace.getImageResourceIds());
            }

            intent.putExtra("phone", selectedPlace.getPhone());
            intent.putExtra("email", selectedPlace.getEmail());
            intent.putExtra("location", selectedPlace.getLocation()); // Correctly set the location
            intent.putExtra("website", selectedPlace.getWebsite()); // Add the website if available

            startActivity(intent);
        });
    }}