package com.tco.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCredential {
    @Test
    @DisplayName("jbahny: test url")
    public void testUrlTunnelTrue(){
        String expected;
        if(Credential.useTunnel != null && Credential.useTunnel.equals("true")) {
            expected = "jdbc:mariadb://127.0.0.1:56247/cs314";
        } else {
            expected = "jdbc:mariadb://faure.cs.colostate.edu/cs314";
        }
        String actual = Credential.url();
        assertEquals(expected, actual);
    }
}
