package com.tco.requests;

//import com.tco.database.DatabaseRequest;

public class Registration {

    private final DatabaseRequest db = DatabaseRequest.getDatabase();

    public String registerUser(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return "Username or password cannot be null or empty";
        }
        if (Boolean.TRUE.equals(db.checkUsernameInDatabase(username))) {
            return "User already exists in the database";
        } else {
            db.addUserToDatabase(username, password);
            return "Registration successful";
        }
    }
}
