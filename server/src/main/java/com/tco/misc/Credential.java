package com.tco.misc;

public class Credential {
    // shared user with read-only access
	final static String useTunnel = System.getenv("CS314_USE_DATABASE_TUNNEL");
	final static String USER = "cs314-db";
	final static String PASSWORD = "eiK5liet1uej";
	// connection information when using port forwarding from localhost
	static String URL = "jdbc:mariadb://127.0.0.1:56247/cs314";
	static String url() {
		if(useTunnel != null && useTunnel.equals("true")) {
			URL = "jdbc:mariadb://127.0.0.1:56247/cs314";
		} else {
			URL = "jdbc:mariadb://faure.cs.colostate.edu/cs314";
		}
		return URL;
	}

}
