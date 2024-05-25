package com.tco.requests;

import com.tco.requests.userManagement.UserRequest;
import com.tco.requests.userManagement.LoginRequest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestLoginRequest {

    private LoginRequest login;
    private String testUsername = "username56817";
    private String testPassword = "password12901";

    @BeforeEach
    public void setup() {
        login = new LoginRequest(testUsername, testPassword);
    }

    @Test
    @DisplayName("gcc: LoginRequest build response test")
    public void testInvitationBuildResponse() {
        assertDoesNotThrow(() -> login.buildResponse());
    }


    @Test
    @DisplayName("gcc: Login Success")
    public void testLoginSuccess() {
        DatabaseRequest db = DatabaseRequest.getDatabase();
        db.removeUserFromDatabase(testUsername, testPassword);
        UserRequest user = new UserRequest(testUsername, testPassword);
        user.buildResponse();
        assertEquals("Registration successful", user.getResponseMessage());
        login.buildResponse();
        assertEquals("Login Successful", login.getResponseMessage());
        db.removeUserFromDatabase(testUsername, testPassword);
    }

    @Test
    @DisplayName("gcc: Login Failure")
    public void testLoginFailure() {
        login.buildResponse();
        assertEquals("Username and/or password is incorrect. Register if you haven't.", login.getResponseMessage());
    }

    @Test
    @DisplayName("gcc: Login Username Empty")
    public void testLoginEmptyUsername() {
        LoginRequest emptyUsername = new LoginRequest("", "abc");
        emptyUsername.buildResponse();
        assertEquals("Username cannot be null or empty.", emptyUsername.getResponseMessage());
    }

    @Test
    @DisplayName("gcc: Login Password Empty")
    public void testLoginEmptyPassword() {
        LoginRequest emptyPassword = new LoginRequest("abc", "");
        emptyPassword.buildResponse();
        assertEquals("Password cannot be null or empty.", emptyPassword.getResponseMessage());
    }

    @Test
    @DisplayName("gcc: Login Username Too Short")
    public void testUsernameTooShort() {
        LoginRequest shortUsernameLogin = new LoginRequest("on", "one");
        shortUsernameLogin.buildResponse();
        assertEquals("Username must be between 3 and 255 characters.", shortUsernameLogin.getResponseMessage());
    }

    @Test
    @DisplayName("gcc: Login Password Too Short")
    public void testPasswordTooShort() {
        LoginRequest shortPasswordLogin = new LoginRequest("one", "on");
        shortPasswordLogin.buildResponse();
        assertEquals("Password must be between 3 and 255 characters.", shortPasswordLogin.getResponseMessage());
    }
}
