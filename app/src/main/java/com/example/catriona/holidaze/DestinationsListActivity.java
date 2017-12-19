package com.example.catriona.holidaze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class DestinationsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_destinations_list);
        Log.d(getClass().toString(),"onCreate clicked");

        Holidaze holidays = new Holidaze();
        ArrayList<Destination> holidayList = holidays.getListOfDestinations();

        HolidazeAdapter holidayAdapter = new HolidazeAdapter(this, holidayList);

        ListView listView = findViewById(R.id.all_holidays);
        listView.setAdapter(holidayAdapter);
    }

    protected void clickHoliday(View holidayItem){
        Destination thisHoliday = (Destination) holidayItem.getTag();
        Log.d("The holiday is: ", thisHoliday.getName());

        Intent intent = new Intent(this, DestinationActivity.class);
        intent.putExtra("holiday", thisHoliday);

        startActivity(intent);
    }

}
