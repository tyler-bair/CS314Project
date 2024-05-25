package com.tco.requests;

//import com.tco.database.DatabaseRequest;

public class Login {

    private final DatabaseRequest db = DatabaseRequest.getDatabase();
    private String message = "";

    public String loginUser(String username, String password) {
        if(!(checkForValidCredential(username, "Username") && checkForValidCredential(password, "Password"))){
            return message;
        }
        if (Boolean.TRUE.equals(db.checkLoginInDatabase(username, password))) {
            message = "Login Successful";
        } else {
            message = "Username and/or password is incorrect. Register if you haven't.";
        }
        return message;
    }

    private boolean checkForValidCredential(String credential, String identifier){
        if (credential == null || credential.isEmpty()){
            message = identifier + " cannot be null or empty.";
            return false;
        }
        if(credential.length() > 255 || credential.length() < 3){
            message = identifier + " must be between 3 and 255 characters.";
            return false;
        }
        return true;

    }

   



}
