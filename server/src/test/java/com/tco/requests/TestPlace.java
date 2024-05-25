package com.tco.requests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;

import static java.lang.Math.toRadians;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlace {

    @Test
    @DisplayName("jbahny: test two argument constructor")
    public void testTwoArg(){
        Place place = new Place("15", "-17");
        String expectedLat = "15";
        String expectedLon = "-17";
        assertEquals(expectedLat, place.get("latitude"));
        assertEquals(expectedLon, place.get("longitude"));
    }

    @Test
    @DisplayName("jbahny: test no arg constructor")
    public void testNoArg(){
        Place place = new Place();
        String expectedLat = null;
        String expectedLon = null;
        assertEquals(expectedLat, place.get("latitude"));
        assertEquals(expectedLon, place.get("longitude"));
    }

    @Test
    @DisplayName("jbahny: test lat radians")
    public void testLatRadians(){
        Place place = new Place("15", "-17");
        Double expected = toRadians(15);
        assertEquals(expected, place.latRadians());
    }

    @Test
    @DisplayName("jbahny: test lon radians")
    public void testLonRadians(){
        Place place = new Place("15", "-17");
        Double expected = toRadians(-17);
        assertEquals(expected, place.lonRadians());
    }
}
