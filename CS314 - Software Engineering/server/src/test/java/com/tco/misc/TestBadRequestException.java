package com.tco.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBadRequestException {

    @Test
    @DisplayName("jbahny: test bad request creation")
    public void testCreation(){
        BadRequestException bad = new BadRequestException();
        assertTrue(bad.created);
    }
}
