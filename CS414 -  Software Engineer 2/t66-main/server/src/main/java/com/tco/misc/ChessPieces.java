package com.tco.misc;

public class ChessPieces {

    public enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
    }

    private boolean isAlive;
    private PieceType currentPiece;

    public ChessPieces(PieceType pieceType) {
        this.isAlive = true;
        this.currentPiece = pieceType;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public PieceType getCurrentPiece() {
        return currentPiece;
    }

    public boolean checkChessRules(int startX, int startY, int endX, int endY) {
        // Leaving empty for now until we get chess rules class made
        return false;
    }
}
