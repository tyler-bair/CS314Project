package com.tco.requests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDistances {

    @Test
    @DisplayName("jbahny: test no entries")
    public void testEmpty() {
        Distances dist = new Distances();
        assertTrue(dist.size() == 0);
    }
    
    @Test
    @DisplayName("aninx: test no distances")
    public void test0Distances(){
        Distances distances = new Distances();
        assertEquals(0, distances.size());
        
    }

    @Test
    @DisplayName("jbahny: test one entry")
    public void testOneEntry() {
        Distances dist = new Distances();
        dist.add(50L);
        assertTrue(dist.size() == 1);
        assertTrue(dist.contains(50L));
    }

    @Test
    @DisplayName("aninx: test one distance")
    public void test1Distances(){
        Distances distances = new Distances();
        distances.add(11037L);
        assertEquals(1, distances.size());
        
    }

    @Test
    @DisplayName("jbahny: test five entries")
    public void testFiveEntries(){
        Distances dist = new Distances();
        dist.add(50L);
        dist.add(40L);
        dist.add(30L);
        dist.add(20L);
        dist.add(10L);
        assertTrue(dist.size() == 5);
        ArrayList<Long> expected = new ArrayList<Long>(5);
        expected.add(50L);
        expected.add(40L);
        expected.add(30L);
        expected.add(20L);
        expected.add(10L);
        assertEquals(expected, dist);
    }
    
    @Test
    @DisplayName("aninx: test distance size")
    public void testDistancesSize() {
        Distances distances = new Distances();
        distances.add(5L);
        distances.add(5L);
        distances.add(5L);
        distances.add(5L);
        assertEquals(4, distances.size());
    }
}
