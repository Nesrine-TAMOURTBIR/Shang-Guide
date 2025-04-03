package com.example.projet_dam;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import com.example.projet_dam.DescriptionActivity;




public class TouristPlacesActivity extends AppCompatActivity {
    private ArrayList<TouristPlace> placesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_places);

        placesList = new ArrayList<>();

        // Oriental Pearl Tower - 2 images
        ArrayList<Integer> orientalPearlImages = new ArrayList<>();
        orientalPearlImages.add(R.drawable.oriental_pearl1);
        orientalPearlImages.add(R.drawable.oriental_pearl2);
        orientalPearlImages.add(R.drawable.oriental_pearl3);

        // The Bund - 3 images
        ArrayList<Integer> theBundImages = new ArrayList<>();
        theBundImages.add(R.drawable.the_bund1);
        theBundImages.add(R.drawable.the_bund2);
        theBundImages.add(R.drawable.the_bund3);

        // Add places to the list
        placesList.add(new TouristPlace("Oriental Pearl Tower", "Famous TV tower in Shanghai.", orientalPearlImages, "+86 21 12345678", "info@orientalpearl.com"));
        placesList.add(new TouristPlace("The Bund", "Historical waterfront in Shanghai.", theBundImages, "+86 21 87654321", "info@thebund.com"));

        // Display the places in a ListView
        ArrayList<String> placeNames = new ArrayList<>();
        for (TouristPlace place : placesList) {
            placeNames.add(place.getName());
        }

        ListView listView = findViewById(R.id.listViewTouristPlaces);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, placeNames);
        listView.setAdapter(adapter);

        // Handle clicks on list items
        listView.setOnItemClickListener((parent, view, position, id) -> {
            TouristPlace selectedPlace = placesList.get(position);

            if (selectedPlace == null) {
                System.out.println("Error: selectedPlace is null!");
                return;
            }

            Intent intent = new Intent(TouristPlacesActivity.this, DescriptionActivity.class);
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
