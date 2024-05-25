package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;

import com.tco.requests.userManagement.UserRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestUserRequest {
    private UserRequest user;

    @BeforeEach
    public void setup() {
        user = new UserRequest("testUser", "testPass");
    }

    @Test
    @DisplayName("colejd: Create build response")
    public void testBuildResponse() {
        assertDoesNotThrow(() -> user.buildResponse());
    }

    @Test
    @DisplayName("maur88: Test Registration Failure")
    public void testRegistrationFailure() {
        user.buildResponse();
        assertEquals("User already exists in the database", user.getResponseMessage());

    }
    @Test
    @DisplayName("maur88: User Registration Success")
    public void testRegistrationSuccess() {
        UserRequest user2 = new UserRequest("testUser2", "testPass2");
        user2.buildResponse();
        assertEquals("Registration successful", user2.getResponseMessage());
        DatabaseRequest db = DatabaseRequest.getDatabase();
        db.removeUserFromDatabase("testUser2", "testPass2");
    }
}
