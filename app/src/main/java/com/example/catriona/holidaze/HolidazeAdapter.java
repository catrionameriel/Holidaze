package com.example.catriona.holidaze;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by catriona on 19/12/2017.
 */

class HolidazeAdapter extends ArrayAdapter<Destination> {

    public HolidazeAdapter(Context context, ArrayList<Destination> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, View listHolidayView, ViewGroup parent){
        if(listHolidayView == null) {
            listHolidayView = LayoutInflater.from(getContext()).inflate(R.layout.each_holiday, parent, false);

            Destination thisDestination = getItem(position);

            TextView timeOfYear = listHolidayView.findViewById(R.id.month);
            timeOfYear.setText(thisDestination.getSeason());

            TextView place = listHolidayView.findViewById(R.id.place);
            place.setText(thisDestination.getName());

            TextView country = listHolidayView.findViewById(R.id.country);
            country.setText(thisDestination.getCountry());

            listHolidayView.setTag(thisDestination);

        }
        return listHolidayView;
    }
}
