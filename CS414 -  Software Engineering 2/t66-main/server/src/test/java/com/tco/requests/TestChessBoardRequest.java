package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestChessBoardRequest {
    private ChessBoardRequest chessBoard;

    @BeforeEach
    public void setup() {
        chessBoard = new ChessBoardRequest();
    }

    @Test
    @DisplayName("quasy14: ChessBoardRequest test build response")
    public void testBuildResponse() {
       
        assertDoesNotThrow(() -> chessBoard.buildResponse());
    }
}