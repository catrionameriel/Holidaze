package com.example.catriona.holidaze;

/**
 * Created by catriona on 19/12/2017.
 */

public enum HolidayType {

    BEACH("Beach"),
    CITY_BREAK("City Break"),
    ALL_INCLUSIVE("All-inclusive"),
    PACKAGE("Package"),
    WINTER("Winter"),
    SPORTS("Sports"),
    COUNTRY_GETAWAY("Country getaway");

    private String name;

    HolidayType(String name){
        this.name = name;
    }

    public String getHolidayTypeName(){
        return this.name;
    }


}
