package com.tco.requests.gameManagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJoinMatchCommand {
    @Test
    @DisplayName("maur88: testing that it exsists")
    public void testExists() {
        JoinMatchCommand joinMatchCommand = new JoinMatchCommand(null, 0);
        assert joinMatchCommand != null;

    }
    @Test
    @DisplayName("maur88: testing that it can be created")
    public void testExecute() {
        JoinMatchCommand joinMatchCommand = new JoinMatchCommand(null, 0);
        assertEquals(joinMatchCommand.getClass(), JoinMatchCommand.class);


    }


}
