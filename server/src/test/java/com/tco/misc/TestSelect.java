package com.tco.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSelect {

    @Test
    @DisplayName("tyler-bair: select test statement")
    public void testStatement(){
        Select select = new Select();
        String expected = "SELECT world.name,world.municipality,region.name AS region,country.name AS country,continent.name AS continent,latitude,longitude FROM world INNER JOIN continent ON world.continent = continent.id INNER JOIN country ON world.iso_country = country.id INNER JOIN region ON world.iso_region = region.id WHERE world.name LIKE \"%dave%\"  OR municipality LIKE \"%dave%\"  OR region.name LIKE \"%dave%\"  OR country.name LIKE \"%dave%\"  OR continent.name LIKE \"%dave%\" 10 ;";
        String actual = select.statement("dave", select.COLUMNS, "10");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("aninx: select.match test")
    public void testMatch(){
        Select select = new Select();
        String expected = "SELECT DISTINCT id,name,municipality,iso_region,iso_country,continent,latitude,longitude,altitude FROM world WHERE name LIKE \"%dave%\" LIMIT 100 ;";
        expected = "SELECT DISTINCT world.name,world.municipality,region.name AS region,country.name AS country,continent.name AS continent,latitude,longitude FROM world INNER JOIN continent ON world.continent = continent.id INNER JOIN country ON world.iso_country = country.id INNER JOIN region ON world.iso_region = region.id WHERE world.name LIKE \"%dave%\"  OR municipality LIKE \"%dave%\"  OR region.name LIKE \"%dave%\"  OR country.name LIKE \"%dave%\"  OR continent.name LIKE \"%dave%\" LIMIT 100 ;";
        String actual = select.match("dave", 100);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("aninx: select.found test")
    public void testFound(){
        Select select = new Select();
        String expected = "SELECT COUNT(*) AS count  FROM world WHERE name LIKE \"%dave%\"  ;";
        expected = "SELECT COUNT(*) AS count FROM world INNER JOIN continent ON world.continent = continent.id INNER JOIN country ON world.iso_country = country.id INNER JOIN region ON world.iso_region = region.id WHERE world.name LIKE \"%dave%\"  OR municipality LIKE \"%dave%\"  OR region.name LIKE \"%dave%\"  OR country.name LIKE \"%dave%\"  OR continent.name LIKE \"%dave%\"  ;";
        String actual = select.found("dave");
        assertEquals(expected, actual);
        
    }

    // @Test
    // @DisplayName("jbahny: test no arg constructor for Places")
    // public void testNoArg(){
    //     Place place = new Place();
    //     String expectedLat = null;
    //     String expectedLon = null;
    //     assertEquals(expectedLat, place.get("latitude"));
    //     assertEquals(expectedLon, place.get("longitude"));
    // }
/* 
    @Test
    @DisplayName("jbahny: test statement")
    public void testStatement(){
        Select select = new Select();
        String expected = "SELECT id,name,municipality,iso_region,iso_country,continent,latitude,longitude,altitude FROM world WHERE name LIKE \"%dave%\" 100 ;";
        String actual = select.statement("dave", select.COLUMNS, "100");
        assertEquals(expected, actual);
    }
/* 
    @Test
    @DisplayName("jbahny: test match")
    public void testMatch(){
        Select select = new Select();
        String expected = "SELECT DISTINCT id,name,municipality,iso_region,iso_country,continent,latitude,longitude,altitude FROM world WHERE name LIKE \"%dave%\" LIMIT 100 ;";
        String actual = select.match("dave", 100);
        assertEquals(expected, actual);
    }

    
    @Test
    @DisplayName("jbahny: test found")
    public void testFound(){
        Select select = new Select();
        String expected = "SELECT COUNT(*) AS count  FROM world WHERE name LIKE \"%dave%\"  ;";
        String actual = select.found("dave");
        assertEquals(expected, actual);
    }
    */
}
