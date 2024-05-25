package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

public class TestLogin {

    private String result;
    private Login login;

    @BeforeEach
    public void setup() {
        login = new Login();
    }

    @Test
    @DisplayName("gcc: Test Login with empty username")
    public void testLoginUserInvalid() {
        result = login.loginUser("", "abc");
        assertEquals("Username cannot be null or empty.", result);
    }

    @Test
    @DisplayName("gcc: Test Login with empty password")
    public void testLoginPasswordInvalid() {
        result = login.loginUser("abc", "");
        assertEquals("Password cannot be null or empty.", result);
    }

    @Test
    @DisplayName("gcc: Test Login with short username")
    public void testLoginUserShort() {
        result = login.loginUser("ab", "abc");
        assertEquals("Username must be between 3 and 255 characters.", result);
    }

    @Test
    @DisplayName("gcc: Test Login with short password")
    public void testLoginPasswordShort() {
        result = login.loginUser("abc", "ab");
        assertEquals("Password must be between 3 and 255 characters.", result);
    }

    @Test
    @DisplayName("gcc: Test Login with existing user")
    public void testLoginSuccess(){
        result = login.loginUser("testUser", "testPass");
        assertEquals("Login Successful", result);
    }

    @Test
    @DisplayName("gcc: Test Login with incorrect credentials")
    public void testLoginFailure(){
        result = login.loginUser("notauser21205", "notapassword20145");
        assertEquals("Username and/or password is incorrect. Register if you haven't.", result);
    }


}
