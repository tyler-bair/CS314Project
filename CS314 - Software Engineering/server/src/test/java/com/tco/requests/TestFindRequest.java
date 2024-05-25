package com.tco.requests;

import com.tco.misc.JSONValidator;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestFindRequest {
    FindRequest find;

    @BeforeEach
    void setUp() {
        find = new FindRequest("tyler", 10);
    }

    private void test(String distances, Type type, boolean valid) {
        try {
            JSONValidator.validate(distances, type);
            assertTrue(valid);
        } catch ( Exception e ) {
            assertFalse(valid);
        }
    }
    
    @Test
    @DisplayName("tylerbair: Valid FindRequest")
    void testDistanceRequestValidity() {
        test("{}", FindRequest.class, false);
    }

    @Test
    @DisplayName("tylerbair: test getMatch")
    void testGetMatch() {
        assertEquals("tyler", find.getMatch());
    }

    @Test
    @DisplayName("tylerbair: test setMatch")
    void testSetMatch() {
        String expect = "bear";
        find.setMatch(expect);
        assertEquals(expect, find.getMatch());
    }

    @Test
    @DisplayName("tylerbair: test getLimit") 
    void testGetLimit() {
        assertTrue(10 == find.getLimit());
    }

    @Test
    @DisplayName("tylerbair: test setLimit")
    void testSetLimit() {
        int expect = 31;
        find.setLimit(expect);
        assertTrue(expect == find.getLimit());
    }

    @Test
    @DisplayName("leeann23: test setMatch")
    void testMatch() {
        String check = "dunn";
        find.setMatch(check);
        assertEquals(check, find.getMatch());
    }
    
    @Test
    @DisplayName("aninx: test setMatch without variable")
    void testMatch2(){
        find.setMatch("franke");
        assertEquals("franke", find.getMatch());
    }

}
