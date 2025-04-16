package com.example.Shang_Guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private LinearLayout languageSwitch;
    private TextView textLanguage;
    private TextView appTitle;
    private TextView titleText;
    private TextView subText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setupLanguageSwitcher();
        setupStartButton();
        updateTextForCurrentLanguage();
    }

    private void initializeViews() {
        btnStart = findViewById(R.id.btnStart);
        languageSwitch = findViewById(R.id.languageSwitch);
        textLanguage = findViewById(R.id.textLanguage);
        appTitle = findViewById(R.id.appTitle);
        titleText = findViewById(R.id.titleText);
        subText = findViewById(R.id.subText);
    }

    private void setupLanguageSwitcher() {
        languageSwitch.setOnClickListener(v -> toggleLanguage());
        updateLanguageButtonText();
    }

    private void toggleLanguage() {
        String currentLang = LocaleHelper.getLanguage(this);
        String newLang = currentLang.equals("en") ? "ar" : "en";
        LocaleHelper.setLocale(this, newLang);
        LocaleHelper.restartActivity(this, MainActivity.class);
    }

    private void updateLanguageButtonText() {
        String currentLang = LocaleHelper.getLanguage(this);
        textLanguage.setText(currentLang.equals("en") ? "AR" : "EN");
    }

    private void updateTextForCurrentLanguage() {
        String currentLang = LocaleHelper.getLanguage(this);
        int direction = currentLang.equals("ar") ?
                View.LAYOUT_DIRECTION_RTL : View.LAYOUT_DIRECTION_LTR;
        languageSwitch.setLayoutDirection(direction);
    }

    private void setupStartButton() {
        btnStart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WarppingActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLanguageButtonText();
        updateTextForCurrentLanguage();
    }
}