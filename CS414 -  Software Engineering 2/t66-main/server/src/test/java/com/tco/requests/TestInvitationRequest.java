package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestInvitationRequest {

    private InvitationRequest invitation;

    @BeforeEach
    public void setup() {
        invitation = new InvitationRequest();
    }

    @Test
    @DisplayName("gcc: InvitationRequest build response test")
    public void testInvitationBuildResponse() {
        assertDoesNotThrow(() -> invitation.buildResponse());
    }


}
