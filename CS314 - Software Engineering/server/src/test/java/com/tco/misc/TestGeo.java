package com.tco.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGeo {

    Random RANDY = new Random();

    public Double getRandom(){
        return (RANDY.nextDouble() - 0.5) * 100.0;
    }

    @Test
    @DisplayName("jbahny: test Geo creation")
    public void testConstructor(){
        Double lat = getRandom();
        Double lon = getRandom();
        Geo geo = new Geo(lat, lon);
        assertEquals(lat, geo.degreesLatitude);
        assertEquals(lon, geo.degreesLongitude);
    }

    @Test
    @DisplayName("jbahny: test radians conversion")
    public void testRadians(){
        Double degLat = getRandom();
        Double degLon = getRandom();
        Geo geo = new Geo(degLat, degLon);
        Double radLat = Math.toRadians(degLat);
        Double radLon = Math.toRadians(degLon);
        assertEquals(radLat, geo.latRadians());
        assertEquals(radLon, geo.lonRadians());
    }
}
