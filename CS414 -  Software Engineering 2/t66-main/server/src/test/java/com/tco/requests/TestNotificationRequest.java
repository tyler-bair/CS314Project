package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestNotificationRequest {
    private NotificationRequest notification;

    @BeforeEach
    public void setup() {
        notification = new NotificationRequest();
    }

    @Test
    @DisplayName("quasy14: NotificationRequest test build response")
    public void testBuildResponse() {
       
        assertDoesNotThrow(() -> notification.buildResponse());
    }
}
