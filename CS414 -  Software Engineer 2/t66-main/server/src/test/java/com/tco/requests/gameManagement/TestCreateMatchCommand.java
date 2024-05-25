package com.tco.requests.gameManagement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCreateMatchCommand {

    @Test
    @DisplayName("maur88: testing that CreateMatchCommand is created")
    public void testingCreateMatch(){
        CreateMatchCommand MC = new CreateMatchCommand(null);
        assert(MC.getClass() == CreateMatchCommand.class);

    }
    @Test
    @DisplayName("maur88: testing that CreateMatchCommand can be executed")
    public void testingCreateMatch2(){
        CreateMatchCommand MC = new CreateMatchCommand(null);
        assert (MC != null);
    }
}
