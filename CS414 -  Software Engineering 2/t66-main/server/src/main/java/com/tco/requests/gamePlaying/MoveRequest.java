package com.tco.requests.gamePlaying;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tco.requests.Move;
import com.tco.requests.MoveFactory;
import com.tco.requests.Request;

public class MoveRequest extends Request {

    private static final Logger log = LoggerFactory.getLogger(MoveRequest.class);
    private int matchID;
    private String fenState;
    private boolean moveSuccess;
    private String pieceType;

    @Override
    public void buildResponse() {
        MoveFactory moveFactory = new MoveFactory();
        Move moveHelper = moveFactory.makeMove(matchID, fenState, pieceType);
        try {
            if(moveHelper != null){
                moveSuccess = moveHelper.storeNewFen();
            }
            else{
                moveSuccess = false;
            }
        } catch (Exception e) {
            log.error("Exception caught during move request", e);
            moveSuccess = false;
        }
        log.trace("buildResponse -> {}", this.getMoveSuccess());

    }

    public MoveRequest(int matchID, String fenState, String pieceType){
        this.matchID = matchID;
        this.fenState = fenState;
        this.pieceType = pieceType;
        this.requestType = "move";
    }

    public boolean getMoveSuccess() {
        return moveSuccess;
    }
}
