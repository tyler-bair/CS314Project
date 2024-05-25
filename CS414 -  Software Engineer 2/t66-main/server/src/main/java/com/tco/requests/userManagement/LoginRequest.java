package com.tco.requests.userManagement;

import com.tco.requests.Login;

import com.tco.requests.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class LoginRequest extends Request {

    private static final Logger log = LoggerFactory.getLogger(LoginRequest.class);
    private final String username;
    private final String password;
    private String responseMessage;
    private String loginSuccess = "false";

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
        this.requestType = "login";
    }

    @Override
    public void buildResponse() {
        Login loginHelper = new Login();
        try {
            this.responseMessage = loginHelper.loginUser(this.username, this.password);
        } catch (Exception e) {
            log.error("Exception caught during login", e);
            this.responseMessage = "Login failed";
        }
        if (Objects.equals(responseMessage, "Login Successful")) {
            this.loginSuccess = "true";
        }
        else {
            this.loginSuccess = "false";
        }
        log.trace("buildResponse -> {}", this.getLoginSuccess());

    }
    public String getResponseMessage() {
        return this.responseMessage;
    }

    public String getLoginSuccess() {
        return this.loginSuccess;
    }


}
