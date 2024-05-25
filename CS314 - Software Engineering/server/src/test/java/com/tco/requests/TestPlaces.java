package com.tco.requests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlaces {

    @Test
    @DisplayName("jbahny: Create empty places")
    public void testEmptyPlaces() {
        Places places = new Places();
        assertTrue(places.size() == 0);
    }

    @Test
    @DisplayName("jbahny: Create places one entry")
    public void testOneEntry() {
        Places places = new Places();
        places.add(new Place("30.0", "-50.0"));
        assertTrue(places.size() == 1);
    }

    @Test
    @DisplayName("jbahny: Create places five entries")
    public void testFiveEntries() {
        Places places = new Places();
        places.add(new Place("30.0", "-50.0"));
        places.add(new Place("0", "0"));
        places.add(new Place("31", "-50"));
        places.add(new Place("15", "-5"));
        places.add(new Place("100", "-100"));
        assertTrue(places.size() == 5);
    }

    @Test
    @DisplayName("leeann23: Testing for places with three entries")
    public void testThree() {
        Places places = new Places();
        places.add(new Place("0", "0"));
        places.add(new Place("0", "1"));
        places.add(new Place("0", "2"));
        assertTrue(places.size() == 3);
    }
}