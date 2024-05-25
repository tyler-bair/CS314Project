package com.tco.misc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class TestDistanceCalculator {

    @Test
    @DisplayName("jbahny: Calculate zero distance")
    public void testZeroDistance() {
        long actual = DistanceCalculator.calculate(new Geo(0.0, 0.0), new Geo(0.0, 0.0), 3145);
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("jbahny: Calculate one distance ")
    public void testDistance1() {
        long actual = DistanceCalculator.calculate(new Geo(51.5, -0.15), new Geo(51.48, -0.11), 3440064.0);
        assertEquals(1918, actual);
    }

    @Test
    @DisplayName("jbahny: Calculate distances w alissaam test")
    public void testDistanceAlissaam() {
        double radius = 3440064.0;
        Geo novaSouth = new Geo(51.5, -0.14);
        Geo victoriaPalaceTheatre = new Geo(51.5, -0.14);
        Geo chesterSquareMews = new Geo(51.5, -0.15);
        Geo saintMarksKennington = new Geo(51.48, -0.11);

        long actual = DistanceCalculator.calculate(novaSouth, victoriaPalaceTheatre, radius);
        assertEquals(0, actual);

        actual = DistanceCalculator.calculate(victoriaPalaceTheatre, chesterSquareMews, radius);
        assertEquals(374, actual);

        actual = DistanceCalculator.calculate(chesterSquareMews, saintMarksKennington, radius);
        assertEquals(1918, actual);

        actual = DistanceCalculator.calculate(saintMarksKennington, novaSouth, radius);
        assertEquals(1643, actual);
    }

    @Test
    @DisplayName("jbahny: Calculate distances w jbahny test")
    public void testDistanceJbahny(){
        double radius = 6371.0;
        Geo westfallHall = new Geo(40.5772228, -105.1028464);
        Geo glennMorrisFieldhouse = new Geo(40.5751082, -105.079821);
        Geo csuVth = new Geo(40.5529465, -105.0830046);
        Geo summitHall = new Geo(40.5703354, -105.1017859);

        long actual = DistanceCalculator.calculate(westfallHall, glennMorrisFieldhouse, radius);
        assertEquals(2, actual);

        actual = DistanceCalculator.calculate(glennMorrisFieldhouse, csuVth, radius);
        assertEquals(2, actual);

        actual = DistanceCalculator.calculate(csuVth, summitHall, radius);
        assertEquals(3, actual);

        actual = DistanceCalculator.calculate(summitHall, westfallHall, radius);
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("maxcolb: Test all four quadrants")
    public void testQuadrantsMaxcolb(){
        double radius = 4371.0;
        Geo quadOne = new Geo(39.89552526235421, -89.82421875000001);
        Geo quadTwo = new Geo(37.44078220467073, 69.08203125000001);
        Geo quadThree = new Geo(-52.506576613963134, -69.96093750000001);
        Geo quadFour = new Geo(-47.073466673102075, 138.86718750000003);

        long actual = DistanceCalculator.calculate(quadOne, quadTwo, radius);
        assertEquals(7650, actual);

        actual = DistanceCalculator.calculate(quadTwo, quadThree, radius);
        assertEquals(11285, actual);

        actual = DistanceCalculator.calculate(quadThree, quadFour, radius);
        assertEquals(5906, actual);

        actual = DistanceCalculator.calculate(quadFour, quadOne, radius);
        assertEquals(11027, actual);
    }

    @Test
    @DisplayName("aninx: Test distanceCalculate with 2 places")
    public void testaninx1(){
        double radius = 3959.0;
        Geo one = new Geo(50.926883, 39.375000);
        Geo two = new Geo(38.048091, -5.976563);

        long actual = DistanceCalculator.calculate(one, two, radius);
        assertEquals(2362, actual);

    }
    
    @Test
    @DisplayName("aninx: Test distanceCalculate with 3 places")
    public void testaninx2(){
        double radius = 3959.0;
        Geo one = new Geo(50.926883, 39.375000);
        Geo two = new Geo(38.048091, -5.976563);
        Geo three = new Geo(63.045927, 15.820313);

        long actual = DistanceCalculator.calculate(one, two, radius);
        assertEquals(2362, actual);
        actual = DistanceCalculator.calculate(two, three, radius);
        assertEquals(1953, actual);
        actual = DistanceCalculator.calculate(three, one, radius);
        assertEquals(1207, actual);

    }
    
    @Test
    @DisplayName("aninx: Test distanceCalculate with 6 places")
    public void testaninx3(){
        double radius = 3959.0;
        Geo one = new Geo(50.926883, 39.375000);
        Geo two = new Geo(38.048091, -5.976563);
        Geo three = new Geo(63.045927, 15.820313);

        Geo four = new Geo(65.935257, 84.375000);
        Geo five = new Geo(60.575073, 119.179688);
        Geo six = new Geo(46.282676, 106.875000);

        long actual = DistanceCalculator.calculate(one, two, radius);
        assertEquals(2362, actual);
        actual = DistanceCalculator.calculate(two, three, radius);
        assertEquals(1953, actual);
        actual = DistanceCalculator.calculate(three, four, radius);
        assertEquals(1947, actual);
        actual = DistanceCalculator.calculate(four, five, radius);
        assertEquals(1127, actual);
        actual = DistanceCalculator.calculate(five, six, radius);
        assertEquals(1106, actual);
        actual = DistanceCalculator.calculate(six, one, radius);
        assertEquals(2992, actual);

    }
    
    @Test
    @DisplayName("aninx: Test distanceCalculate with 10 places")
    public void testaninx4(){
        double radius = 3959.0;
        Geo one = new Geo(50.926883, 39.375000);
        Geo two = new Geo(38.048091, -5.976563);
        Geo three = new Geo(63.045927, 15.820313);
        Geo four = new Geo(65.935257, 84.375000);
        Geo five = new Geo(60.575073, 119.179688);
        Geo six = new Geo(46.282676, 106.875000);

        Geo seven = new Geo(22.858535, 45.351563);
        Geo eight = new Geo(0.312912, 114.257813);
        Geo nine = new Geo(-31.382693, 121.289063);
        Geo ten = new Geo(-38.878297, -67.148438);

        long actual = DistanceCalculator.calculate(one, two, radius);
        assertEquals(2362, actual);
        actual = DistanceCalculator.calculate(two, three, radius);
        assertEquals(1953, actual);
        actual = DistanceCalculator.calculate(three, four, radius);
        assertEquals(1947, actual);
        actual = DistanceCalculator.calculate(four, five, radius);
        assertEquals(1127, actual);
        actual = DistanceCalculator.calculate(five, six, radius);
        assertEquals(1106, actual);

        actual = DistanceCalculator.calculate(six, seven, radius);
        assertEquals(3748, actual);
        actual = DistanceCalculator.calculate(seven, eight, radius);
        assertEquals(4872, actual);
        actual = DistanceCalculator.calculate(eight, nine, radius);
        assertEquals(2238, actual);
        actual = DistanceCalculator.calculate(nine, ten, radius);
        assertEquals(7552, actual);
        actual = DistanceCalculator.calculate(ten, one, radius);
        assertEquals(8901, actual);

    }

    @Test
    @DisplayName("jbahny: test constructor")
    public void testConstructor(){
        DistanceCalculator dc = new DistanceCalculator();
        assertTrue(dc.equals(dc));
    }
}
