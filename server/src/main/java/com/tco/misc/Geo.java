package com.tco.misc;

public class Geo implements GeographicCoordinate {
    Double degreesLatitude;
    Double degreesLongitude;

    public Geo(Double lat, Double lon) {
        this.degreesLatitude = lat;
        this.degreesLongitude = lon;
    }

    @Override
    public Double latRadians() {
        return Math.toRadians(degreesLatitude);
    }

    @Override
    public Double lonRadians() {
        return Math.toRadians(degreesLongitude);
    }
}