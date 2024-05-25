package com.tco.requests;

//import com.tco.database.DatabaseRequest;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class PawnMove extends Move {

    public PawnMove(int matchID, String fenState){
        super(matchID, fenState);
    }

    @Override
    public boolean determineIfLegal(){
        // Code to determine if move was legal for a pawn goes here
        return true;
    }  
}