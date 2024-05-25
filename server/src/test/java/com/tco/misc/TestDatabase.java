package com.tco.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDatabase {


    @Test
    @DisplayName("jbahny: test credentials")
    public void testCredential(){
        String expectedUser = "cs314-db";
        String expectedPassword = "eiK5liet1uej";
        String expectedURL = "jdbc:mariadb://127.0.0.1:56247/cs314";
        Credential credential = new Credential();
        assertEquals(expectedUser, credential.USER);
        assertEquals(expectedPassword, credential.PASSWORD);
        if(credential.useTunnel != null && credential.useTunnel.equals("true")) {
            expectedURL = "jdbc:mariadb://127.0.0.1:56247/cs314";
        } else {
			expectedURL = "jdbc:mariadb://faure.cs.colostate.edu/cs314";
		}
        assertEquals(expectedURL, credential.url());
    }
    
    @Test
    @DisplayName("aninx: test not found")
    public void testNotFound() throws Exception {
        Credential credential = new Credential();
        Integer expected = 0;
        Integer actual = 0;
        try{
            actual = Database.found("dakdlfjksdlgjdkhgjdsafdkjhfsa");
        }
        catch(Exception exc){
            actual = -1; //This will return 0 every time this exception happens.
        }
        assertEquals(expected, actual);}

    @Test
    @DisplayName("aninx: test found")
    public void testFound() throws Exception {
        Credential credential = new Credential();
        Integer expected = 28;
        Integer actual = Database.found("dave");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("aninx: test found 2")
    public void testFound2() throws Exception {
        Credential credential = new Credential();
        Integer expected = 14;
        Integer actual = Database.found("flora");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("aninx: test found 3")
    public void testFound3() throws Exception {
        Credential credential = new Credential();
        Integer expected = 50415;
        Integer actual = Database.found("a");
        assertEquals(expected, actual);
    }

   
}
