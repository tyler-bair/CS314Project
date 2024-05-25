package com.tco.requests;


public class MoveFactory {
    public Move makeMove(int matchID, String fenState, String pieceType){
        if(pieceType.equals("Pawn")){
        PawnMove move = new PawnMove(matchID, fenState);
        return move;
        }
        //Checks for other piece types go here
        return null;
    }
}
