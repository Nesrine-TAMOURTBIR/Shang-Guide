package com.example.Shang_Guide;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class TouristPlacesActivity extends AppCompatActivity {
    private ArrayList<Place> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_places);


        LinearLayout languageSwitch = findViewById(R.id.language_switch);
        languageSwitch.setOnClickListener(v -> {
            String currentLang = LocaleHelper.getLanguage(this);
            String newLang = currentLang.equals("en") ? "ar" : "en";
            LocaleHelper.setLocale(this, newLang);
            LocaleHelper.restartActivity(this, TouristPlacesActivity.class);
        });



        // Adjust layout direction based on language
        String currentLang = LocaleHelper.getLanguage(this);
        if (currentLang.equals("ar")) {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        } else {
            languageSwitch.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }


        placesList = new ArrayList<>();

        // Oriental Pearl Tower - 3 images
        ArrayList<Integer> orientalPearlImages = new ArrayList<>();
        orientalPearlImages.add(R.drawable.oriental_pearl1);
        orientalPearlImages.add(R.drawable.oriental_pearl2);
        orientalPearlImages.add(R.drawable.oriental_pearl3);

        // The Bund - 3 images
        ArrayList<Integer> theBundImages = new ArrayList<>();
        theBundImages.add(R.drawable.the_bund1);
        theBundImages.add(R.drawable.the_bund2);
        theBundImages.add(R.drawable.the_bund3);

        // shanghai museum - 3 images
        ArrayList<Integer> shanghaiMuseumImages = new ArrayList<>();
        shanghaiMuseumImages.add(R.drawable.shanghai_museum1);
        shanghaiMuseumImages.add(R.drawable.shanghai_museum2);
        shanghaiMuseumImages.add(R.drawable.shanghai_museum3);

        // shanghai museum - 4 images
        ArrayList<Integer> zhujiajiaoWaterTownImages = new ArrayList<>();
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town1);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town2);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town3);
        zhujiajiaoWaterTownImages.add(R.drawable.zhujiajiao_water_town4);

        // jingan Temple - 3 images
        ArrayList<Integer> jinganTempleImages = new ArrayList<>();
        jinganTempleImages.add(R.drawable.jingan_temple1);
        jinganTempleImages.add(R.drawable.jingan_temple2);
        jinganTempleImages.add(R.drawable.jingan_temple3);

        // shanghai museum - 5 images
        ArrayList<Integer> shanghaiDisneylandImages = new ArrayList<>();
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland1);
        shanghaiDisneylandImages.add(R.drawable.img);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland3);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland4);
        shanghaiDisneylandImages.add(R.drawable.shanghai_disneyland5);

        // tianzifang shanghai - 4 images
        ArrayList<Integer> tianzifangImages = new ArrayList<>();
        tianzifangImages.add(R.drawable.tianzifang1);
        tianzifangImages.add(R.drawable.tianzifang2);
        tianzifangImages.add(R.drawable.tianzifang3);





        // Add places to the list with multilingual support
        placesList.add(new Place(
                getString(R.string.oriental_pearl_tower_name),
                getString(R.string.oriental_pearl_tower_description),
                orientalPearlImages,
                "+86 21 5879 1888",
                "info@orientalpearl.com",
                getString(R.string.oriental_pearl_tower_address),
                "www.orientalpearltower.com"
        ));

        placesList.add(new Place(
                getString(R.string.jingan_temple_name),
                getString(R.string.jingan_temple_description),
                jinganTempleImages,
                "+86 21 6256 3666",
                "info@jingantemple.com",
                getString(R.string.jingan_temple_address),
                "www.jingantemple.com"
        ));

        placesList.add(new Place(
                getString(R.string.zhujiajiao_water_town_name),
                getString(R.string.zhujiajiao_water_town_description),
                zhujiajiaoWaterTownImages,
                "+86 21 5924 0088",
                "zhujiajiaoWaterTown@gmail.com",
                getString(R.string.zhujiajiao_water_town_address),
                "zhujiajiaoWaterTown.com"
        ));

        // Add places to the list with multilingual support
        placesList.add(new Place(
                getString(R.string.tianzifang_name),
                getString(R.string.tianzifang_description),
                tianzifangImages,
                "", // No central phone
                "",
                getString(R.string.tianzifang_address),
                ""
        ));


        // Add places to the list with multilingual support
        placesList.add(new Place(
                getString(R.string.the_bund_name),
                getString(R.string.the_bund_description),
                theBundImages,
                "+86 21 6321 5757",
                "info@shanghaitour.com",
                getString(R.string.the_bund_address),
                "www.shanghaitour.com/thebund"
        ));

        // Add places to the list with multilingual support
        placesList.add(new Place(
                getString(R.string.shanghai_museum_name),
                getString(R.string.shanghai_museum_description),
                shanghaiMuseumImages,
                "+86 21 6372 3500",
                "info@shanghaimuseum.net",
                getString(R.string.shanghai_museum_address),
                "www.shanghaimuseum.net"
        ));




// Add places to the list with multilingual support


        placesList.add(new Place(
                getString(R.string.shanghai_disneyland_name),
                getString(R.string.shanghai_disneyland_description),
                shanghaiDisneylandImages,
                "+86 21 3158 0000",
                "guest.services@shanghaidisneyresort.com",
                getString(R.string.shanghai_disneyland_address),
                "www.shanghaidisneyresort.com"
        ));




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

            Intent intent = new Intent(TouristPlacesActivity.this, DescriptionActivity.class);
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