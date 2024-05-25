package com.tco.requests;

import com.tco.misc.DistanceCalculator;
import com.tco.misc.Geo;
import com.tco.misc.GeographicCoordinate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DistanceRequest extends Request {

    private static final transient Logger logg = LoggerFactory.getLogger(DistanceRequest.class);
    private Distances distances;
    private Double earthRadius; 
    private Places places;

    public void buildResponse(){
        distances = buildDistanceList();

        logg.trace("build response -> {}", this);
    }

    public DistanceRequest(double earthRadius, Places places) {
        super();
        this.requestType = "distances";
        this.earthRadius = earthRadius;
        this.places = places;
    }

    public Distances getDistances() { return distances; }

    public double earthRadius(){
        return this.earthRadius;
    }

    public Places places(){
        return this.places;
    }

    private Distances buildDistanceList() {
        Distances distances = new Distances();
        if(places.size() == 0) {
            return distances;
        } else {
            for (int i = 0; i < places().size() - 1; i++){
                Place fromCord = places().get(i);
                Place toCord = places().get(i + 1);
                GeographicCoordinate from = new Geo(Double.parseDouble(fromCord.get("latitude")), Double.parseDouble(fromCord.get("longitude")));
                GeographicCoordinate to = new Geo(Double.parseDouble(toCord.get("latitude")), Double.parseDouble(toCord.get("longitude")));
                Long distance = DistanceCalculator.calculate(from, to, earthRadius());
                distances.add(distance);
            }
            GeographicCoordinate start = new Geo(Double.parseDouble(places().get(0).get("latitude")), Double.parseDouble(places().get(0).get("longitude")));
            GeographicCoordinate end = new Geo(Double.parseDouble(places().get(places().size() - 1).get("latitude")), Double.parseDouble(places().get(places().size() - 1).get("longitude")));
            Long startToEnd = DistanceCalculator.calculate(start, end, earthRadius());
            distances.add(startToEnd);
            return distances;
        }
    }

}
