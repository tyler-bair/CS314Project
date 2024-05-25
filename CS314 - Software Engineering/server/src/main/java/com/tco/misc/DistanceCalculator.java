package com.tco.misc;

import java.lang.Math;

public class DistanceCalculator{
    public DistanceCalculator(){}

    public static Long calculate(GeographicCoordinate from, GeographicCoordinate to, double earthRadius){
        Double lambda = Math.abs(from.lonRadians() - to.lonRadians());
        Double phi1 = to.latRadians();
        Double phi2 = from.latRadians();

        double topHalf = Math.sqrt(Math.pow(Math.cos(phi2) * Math.sin(lambda), 2) + (Math.pow(Math.cos(phi1) * Math.sin(phi2) - Math.sin(phi1) * Math.cos(phi2) * Math.cos(lambda), 2)));
        double bottomHalf = Math.sin(phi1)*Math.sin(phi2)+Math.cos(phi1)*Math.cos(phi2)*Math.cos(lambda);

        double centralAngle = Math.atan2(topHalf, bottomHalf);
        double distance = Math.round(earthRadius * centralAngle);

        return (long)distance;
    }
}
