package com.example.catriona.holidaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_in_detail);

        Intent intent = getIntent();
        Destination holiday = (Destination) intent.getSerializableExtra("holiday");

        TextView name = findViewById(R.id.holiday);
        name.setText(holiday.getName());

        TextView country= findViewById(R.id.country);
        country.setText(holiday.getCountry());

        TextView temperature = findViewById(R.id.temp);
        String temperatureString = Integer.toString(holiday.getAverageTemperature());
        temperature.setText("Average temperature - " + temperatureString + "C");

        TextView season = findViewById(R.id.month);
        String seasonString = holiday.getSeason();
        season.setText("Best time to go - " + seasonString);

        TextView type = findViewById(R.id.type);
        type.setText("Type - " + holiday.getHolidayTypeName());

        TextView currency = findViewById(R.id.currency);
        currency.setText("Currency - " + holiday.getCurrency());
    }
}
