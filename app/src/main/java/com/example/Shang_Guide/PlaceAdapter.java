package com.example.Shang_Guide;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Place place = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_place, parent, false);
        }

        TextView placeName = convertView.findViewById(R.id.placeName);
        ImageView backgroundImage = convertView.findViewById(R.id.backgroundImage);

        placeName.setText(place.getName());

        // Set the first image as the background
        if (place.getImageResourceIds() != null && !place.getImageResourceIds().isEmpty()) {
            backgroundImage.setImageResource(place.getImageResourceIds().get(0));
        }

        return convertView;
    }
}
