package com.tco.misc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.lang.Exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tco.requests.Place;
import com.tco.requests.Places;

public class Database {
	private static final Logger log = LoggerFactory.getLogger(Database.class);
	private static final String COLUMNS = "name,municipality,region,country,continent,latitude,longitude";
	private static Integer found;
	private static final int ZERO_SPECIAL_CASE = 150;

	public static Integer getFound() {
		return found;
	}

	public static Integer found(String match) throws Exception {
		String sql = Select.found(match);
		try (
			// connect to the database and query
			Connection conn = DriverManager.getConnection(Credential.url(), Credential.USER, Credential.PASSWORD);
			Statement query = conn.createStatement();
			ResultSet results = query.executeQuery(sql); //There was a semicolon missing here
		) {
			found = count(results);
			return found;
		} catch (Exception e) {
			throw e;
		}
	}
	private static Integer count(ResultSet results) throws Exception {
		if (results.next()) {
			return results.getInt("count");
		}
		throw new Exception("No count results in found query.");
	}
	public static Places places(String match, Integer limit) throws Exception {
		String sql;
		if(limit==0){
			sql = Select.match(match, ZERO_SPECIAL_CASE);
		} else {
			sql = Select.match(match, limit);
		}

		String url      = Credential.url();
		String user     = Credential.USER;
		String password = Credential.PASSWORD;
		try (
			// connect to the database and query
			Connection conn    = DriverManager.getConnection(url, user, password);
			Statement  query   = conn.createStatement();
			ResultSet  results = query.executeQuery(sql)
		) {
			return convertQueryResultsToPlaces(results, COLUMNS);
		} catch (Exception e) {
			throw e;
		}
	}
	private static Places convertQueryResultsToPlaces(ResultSet results, String columns) throws Exception {
		int count = 0;
		String[] cols = columns.split(",");
		Places places = new Places();
		while (results.next()) {
			Place place = new Place();
			for (String col: cols) {
				place.put(col, results.getString(col));
			}
			System.out.println(place);
			place.put("index", String.format("%d",++count));
			places.add(place);
			count++;
		}
		return places;
	}

}