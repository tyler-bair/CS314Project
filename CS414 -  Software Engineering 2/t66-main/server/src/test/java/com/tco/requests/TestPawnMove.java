package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class TestPawnMove {
    
    private PawnMove pawnMove;

    @BeforeEach
    public void setup() {
        pawnMove = new PawnMove(10000, "testFen");
    }

    @Test
    @DisplayName("gcc: Test determineIfLegal()")
    public void testMoveBuildResponse() {
        assertEquals(pawnMove.determineIfLegal(), true);
    }

}
