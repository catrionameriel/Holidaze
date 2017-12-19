package com.example.catriona.holidaze;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by catriona on 19/12/2017.
 */

public class DestinationTest {

    Destination destination;

    @Before
    public void before(){
        destination = new Destination("Loire", "France", "July - August", 25, "Euro", HolidayType.COUNTRY_GETAWAY);
    }

    @Test
    public void canGetName(){
        assertEquals("Loire", destination.getName());
    }

    @Test
    public void canGetCountry(){
        assertEquals("France", destination.getCountry());
    }

    @Test
    public void canGetSeason(){
        assertEquals("July - August", destination.getSeason());
    }

    @Test
    public void canGetTemperature(){
        assertEquals(25, destination.getAverageTemperature());
    }

    @Test
    public void canGetCurrency(){
        assertEquals("Euro", destination.getCurrency());
    }

    @Test
    public void canGetHolidayType(){
        assertEquals(HolidayType.COUNTRY_GETAWAY, destination.getType());
    }

    @Test
    public void canGetHolidayTypeName(){
        assertEquals("Country getaway", destination.getHolidayTypeName());
    }
}
