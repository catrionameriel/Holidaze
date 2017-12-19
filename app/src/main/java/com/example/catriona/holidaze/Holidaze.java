package com.example.catriona.holidaze;

import java.util.ArrayList;

/**
 * Created by catriona on 19/12/2017.
 */

public class Holidaze {

    private ArrayList<Destination> destinations;

    public Holidaze(){
        destinations = new ArrayList<>();
        destinations.add(new Destination("Loire", "France", "July", 25, "Euro", HolidayType.COUNTRY_GETAWAY));
        destinations.add(new Destination("Maui", "Hawaii", "January", 27, "US Dollar", HolidayType.BEACH ));
        destinations.add(new Destination("Tokyo", "Japan", "September", 24, "yen", HolidayType.CITY_BREAK));
        destinations.add(new Destination("Naples", "Italy", "June", 23, "Euro", HolidayType.CITY_BREAK));
    }

    public ArrayList getListOfDestinations(){
        return this.destinations;
    }

}
