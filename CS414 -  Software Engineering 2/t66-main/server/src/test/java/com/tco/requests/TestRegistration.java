package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestRegistration {

    @Test
    @DisplayName("maur88 - Test registration with null or empty details")
    public void testRegisterUserInvalid() {
        Registration registration = new Registration();
        String result = registration.registerUser("", "");
        assertEquals("Username or password cannot be null or empty", result);
    }

    @Test
    @DisplayName("maur88 - Testing user registration with username already in database")
    public void testUserReg(){
        Registration registration = new Registration();
        String result = registration.registerUser("testUser", "testPass");
        assertEquals("User already exists in the database", result);
    }

    @Test
    @DisplayName("maur88 - Testing user registration with username not in database")
    public void testUserReg2(){
        Registration registration = new Registration();
        String result = registration.registerUser("testUser2", "testPass2");
        assertEquals("Registration successful", result);
        DatabaseRequest db = DatabaseRequest.getDatabase();
        db.removeUserFromDatabase("testUser2", "testPass2");
    }
}
