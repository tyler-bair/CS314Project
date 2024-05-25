package com.tco.misc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ChessPiecesTest {

    @Test
    @DisplayName("maur88: basic test for constructor")
    public void testConstructor() {
        ChessPieces chessPiece = new ChessPieces(ChessPieces.PieceType.PAWN);
        assertNotNull(chessPiece, "Failed to instantiate ChessPieces.");
    }

    @Test
    @DisplayName("maur88 - Creation of Chess Piece - Pawn")
    public void createPawnPiece() {
        ChessPieces pawn = new ChessPieces(ChessPieces.PieceType.PAWN);
        assertEquals(ChessPieces.PieceType.PAWN, pawn.getCurrentPiece());
        assertTrue(pawn.isAlive());
    }

    @Test
    @DisplayName("maur88 - Setting Alive Status")
    public void setAliveStatus() {
        ChessPieces rook = new ChessPieces(ChessPieces.PieceType.ROOK);
        rook.setAlive(false);
        assertFalse(rook.isAlive());
    }

    @Test
    @DisplayName("maur88 - Check Chess Rules - Placeholder redo once chess rules class is made")
    public void checkChessRules() {
        ChessPieces knight = new ChessPieces(ChessPieces.PieceType.KNIGHT);
        assertFalse(knight.checkChessRules(0, 0, 1, 2));
    }
}
