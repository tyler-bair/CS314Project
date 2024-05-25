package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestChessRulesRequest {
    private ChessRulesRequest rules;

    @BeforeEach
    public void setup() {
        rules = new ChessRulesRequest();
    }

    @Test
    @DisplayName("colejd: Testing chessRulesRequest builds")
    public void testBuildResponse() {
       
        assertDoesNotThrow(() -> rules.buildResponse());
    }
}
