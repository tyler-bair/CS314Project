package com.tco.requests;

import java.util.HashMap;
import static java.lang.Math.toRadians;
import static java.lang.Double.parseDouble;
import com.tco.misc.GeographicCoordinate;

public class Place extends HashMap<String,String> implements GeographicCoordinate {
    public Place(String lat, String lon) {
        this.put("latitude", lat);
        this.put("longitude", lon);
    }

    public Place() {
        // no arg constructor for GSON to work
    }

    public Double latRadians() {
        return toRadians(parseDouble(this.get("latitude")));
    }

    public Double lonRadians() {
        return toRadians(parseDouble(this.get("longitude")));
    }

    //public String id() { return this.get("id"); }
}
