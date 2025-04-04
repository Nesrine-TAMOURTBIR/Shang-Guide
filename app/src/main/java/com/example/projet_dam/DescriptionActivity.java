package com.example.projet_dam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        // استقبال البيانات من الـ Intent مع تعيين القيم الافتراضية مباشرة
        final String name = getIntent().getStringExtra("name") != null ? getIntent().getStringExtra("name") : "No Name Available";
        final String description = getIntent().getStringExtra("description") != null ? getIntent().getStringExtra("description") : "No Description Available";
        final ArrayList<Integer> images = getIntent().getIntegerArrayListExtra("images") != null ? getIntent().getIntegerArrayListExtra("images") : new ArrayList<>();
        final String phone = getIntent().getStringExtra("phone") != null ? getIntent().getStringExtra("phone") : "No Phone Available";
        final String email = getIntent().getStringExtra("email") != null ? getIntent().getStringExtra("email") : "No Email Available";

        // العثور على مكونات الواجهة
        TextView textViewName = findViewById(R.id.textViewTitle);
        TextView textViewDescription = findViewById(R.id.textViewDescription);
        TextView textViewPhone = findViewById(R.id.textViewPhone);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewImages);

        // تهيئة RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ImageSliderAdapter adapter = new ImageSliderAdapter(images);
        recyclerView.setAdapter(adapter);

        // تعيين محتوى النصوص
        textViewName.setText(name);
        textViewDescription.setText(description);
        textViewPhone.setText("Phone: " + phone);
        textViewEmail.setText("Email: " + email);

        // إضافة تعليمات النقر على رقم الهاتف
        textViewPhone.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:" + phone));
            startActivity(callIntent);
        });

        // إضافة تعليمات النقر على البريد الإلكتروني
        textViewEmail.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + email));
            startActivity(emailIntent);
        });
    }
}
