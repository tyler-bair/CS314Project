package com.tco.requests.gamePlaying;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.tco.requests.DatabaseRequest;

public class TestMoveRequest {

    private MoveRequest moveRequest;
    private MoveRequest revertMoveRequest;
    private DatabaseRequest db;

    @BeforeEach
    public void setup() {
        moveRequest = new MoveRequest(260, "testFen", "Pawn");
        db = DatabaseRequest.getDatabase();
        revertMoveRequest = new MoveRequest(260, "", "Pawn");
    }

    @Test
    @DisplayName("gcc: MoveRequest build response test")
    public void testMoveBuildResponse() {
        moveRequest.buildResponse();
        assertEquals(moveRequest.getMoveSuccess(), true);
        revertMoveRequest.buildResponse();
        assertEquals(moveRequest.getMoveSuccess(), true);
    }


}
