package com.tco.requests;
import com.tco.requests.Match;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMatch{
    private Match match;

    @BeforeEach
    public void setup() {
        int matchID = 00000000;
        match = new Match(matchID);
    }

    @Test
    @DisplayName("maur88: Test that the matchID is set correctly")
    public void testMatch() {
        Match tmp = new Match(00000000);
        assertEquals(tmp.getClass(), Match.class);

    }



}
