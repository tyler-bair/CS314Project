package com.tco.requests;

//import com.tco.database.DatabaseRequest;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Move {

    private int matchID;
    private DatabaseRequest db = DatabaseRequest.getDatabase();
    private String fenState;

    public Move(int matchID, String fenState){
        this.matchID = matchID;
        this.fenState = fenState;
    }

    public boolean storeNewFen(){
        String query = "UPDATE matches SET fen_state = ? WHERE match_id = ?";
        List<Object> params = new ArrayList<>();
        params.add(fenState);
        params.add(matchID);
        db.runAnyQuery(query, params);
        return true;
    }

    public abstract boolean determineIfLegal();
    
}
