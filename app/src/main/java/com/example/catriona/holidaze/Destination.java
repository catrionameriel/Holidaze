package com.example.catriona.holidaze;

import java.io.Serializable;

/**
 * Created by catriona on 19/12/2017.
 */

public class Destination implements Serializable {

    private String name;
    private String countyOfOrigin;
    private String bestTimeOfYear;
    private int averageTemp;
    private String currency;
    private HolidayType type;


    public Destination (String name, String countryOfOrigin, String bestTimeOfYear, int averageTemp, String currency, HolidayType type) {
        this.name = name;
        this.countyOfOrigin = countryOfOrigin;
        this.bestTimeOfYear = bestTimeOfYear;
        this.averageTemp = averageTemp;
        this.currency = currency;
        this.type = type;
    }


    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.countyOfOrigin;
    }

    public String getSeason() {
        return this.bestTimeOfYear;
    }

    public int getAverageTemperature() {
        return this.averageTemp;
    }

    public String getCurrency() {
        return currency;
    }

    public HolidayType getType() {
        return type;
    }

    public String getHolidayTypeName() {
        return type.getHolidayTypeName();
    }
}
