package com.tco.requests.userManagement;

import com.tco.requests.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;


public class UserRequest extends Request {

    private static final Logger log = LoggerFactory.getLogger(UserRequest.class);
    private final String username;
    private final String password;
    private String responseMessage;
    private String registrationSuccess = "false";

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
        this.requestType = "user";
    }

    @Override
    public void buildResponse() {
        Registration registrationHelper = new Registration();
        try {
            this.responseMessage = registrationHelper.registerUser(this.username, this.password);
        } catch (Exception e) {
            log.error("Exception caught during registration", e);
            this.responseMessage = "Registration failed";
        }
        if (Objects.equals(responseMessage, "Registration successful")) {
            this.registrationSuccess = "true";
        }
        else {
            this.registrationSuccess = "false";
        }
        log.trace("buildResponse -> {}", this.getRegistrationSuccess());

    }
    public String getResponseMessage() {
        return this.responseMessage;
    }

    public String getRegistrationSuccess() {
        return this.registrationSuccess;
    }


}
