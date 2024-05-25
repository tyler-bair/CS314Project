package com.tco.misc;

import java.util.ArrayList;
import java.util.HashMap;
import com.tco.requests.Place;
import com.tco.requests.Places;
import com.tco.misc.Credential;

public class Select {

    protected final static String TABLE = "world INNER JOIN continent ON world.continent = continent.id INNER JOIN country ON world.iso_country = country.id INNER JOIN region ON world.iso_region = region.id";
	protected final static String COLUMNS = "world.name,world.municipality,region.name AS region,country.name AS country,continent.name AS continent,latitude,longitude";

    static String match(String match, int limit) {
        return statement(match, "DISTINCT " + COLUMNS, "LIMIT " + limit);
    }

    static String found(String match) {
        return statement(match, "COUNT(*) AS count", "");
    }

    static String statement(String match, String data, String limit) {
        return "SELECT "
            + data
            + " FROM " + TABLE
            + " WHERE world.name LIKE \"%" + match + "%\" "
            + " OR municipality LIKE \"%" + match + "%\" "
            + " OR region.name LIKE \"%" + match + "%\" "
            + " OR country.name LIKE \"%" + match + "%\" "
            + " OR continent.name LIKE \"%" + match + "%\" "
            + limit
            + " ;";
    }
}