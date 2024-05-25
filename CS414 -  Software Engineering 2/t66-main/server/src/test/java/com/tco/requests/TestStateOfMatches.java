package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestStateOfMatches {

    private StateOfMatches matchState;

    @BeforeEach
    public void setup() {
        matchState = new StateOfMatches();
    }

    @Test
    @DisplayName("tbair: StateOfMatches build response test")
    public void testMoveBuildResponse() {
        assertDoesNotThrow(() -> matchState.buildResponse());
    }


}
