package com.example.Shang_Guide;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class HotelsActivity extends AppCompatActivity {
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
            LocaleHelper.restartActivity(this, HotelsActivity.class);  // or your activity
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
        UltravioletImages.add(R.drawable.h1);


        placesList.add(new Place(
                getResources().getString(R.string.peninsula_name),
                getResources().getString(R.string.peninsula_description),
                UltravioletImages,
                "+86 21 6323 9898",
                "reservations@uvbypp.cc",
                getResources().getString(R.string.peninsula_address),
                "www.uvbypp.cc"));



        // 2)  Fu 1088 - 3 images
        ArrayList<Integer> fu1088Images = new ArrayList<>();

        fu1088Images.add(R.drawable.h2);



        placesList.add(new Place(
                getResources().getString(R.string.puli_name),
                getResources().getString(R.string.puli_description),
                fu1088Images,
                "+86 21 6247 6678",
                "reservations@fu1088.com",
                getResources().getString(R.string.puli_address),
                "www.fu1088.com"));



        // 3)  Polux by Paul Pairet - 6 images
        ArrayList<Integer> poluxImages = new ArrayList<>();
        poluxImages.add(R.drawable.h3);

        placesList.add(new Place( getResources().getString(R.string.urbn_name),
                getResources().getString(R.string.urbn_description),
                poluxImages, // Your image array
                "+86 21 5383 5757",
                "reservations@polux.cn",
                getResources().getString(R.string.urbn_address),
                "www.polux-china.com"));


        // 4)  Lü Bo Lang - 6 images
        ArrayList<Integer> lubolangImages = new ArrayList<>();

        lubolangImages.add(R.drawable.h4);



        placesList.add(new Place( getResources().getString(R.string.waterhouse_name),
                getResources().getString(R.string.waterhouse_description),
                lubolangImages,
                "+86 21 6328 0602",
                getResources().getString(R.string.waterhouse_address),
                "115 Yuyuan Road",
                ""));


        // 5)  ROOF - 6 images
        ArrayList<Integer> roofImages = new ArrayList<>();
        roofImages.add(R.drawable.h5);


        placesList.add(new Place( getResources().getString(R.string.radisson_name),
                getResources().getString(R.string.radisson_description),
                roofImages,
                "+86 21 5368 9999",
                "dining.shanghai@editionhotels.com",
                getResources().getString(R.string.radisson_address),
                "www.editionhotels.com/shanghai/roof"));

        // 6)  Yi Cafe - 5 images
        ArrayList<Integer> yicafeImages = new ArrayList<>();
        yicafeImages.add(R.drawable.h6);


        placesList.add(new Place(getResources().getString(R.string.wonderland_name),
                getResources().getString(R.string.wonderland_description),
                yicafeImages,
                "+86 21 6882 8888",
                "dining@thepuli.com",
                getResources().getString(R.string.wonderland_address),
                "www.thepuli.com/dining"));

        // 7)  Xin Guang - 5 images
        ArrayList<Integer> xinguangImages = new ArrayList<>();

        xinguangImages.add(R.drawable.h7);

        placesList.add(new Place(getResources().getString(R.string.fairmont_name),
                getResources().getString(R.string.fairmont_description),
                xinguangImages,
                "+86 21 6322 3978",
                "No email",
                getResources().getString(R.string.fairmont_address),
                "None"));



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

            Intent intent = new Intent(HotelsActivity.this, DescriptionActivity.class);
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