package com.example.practic_2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = findViewById(R.id.detail_text);
        TextView descriptionView = findViewById(R.id.detail_description);  // Новый TextView для описания

        // Получаем данные из интента
        String countryName = getIntent().getStringExtra("country_name");
        String countryDescription = getIntent().getStringExtra("country_description");

        // Устанавливаем название и описание
        textView.setText(countryName);
        descriptionView.setText(countryDescription);
    }
}
