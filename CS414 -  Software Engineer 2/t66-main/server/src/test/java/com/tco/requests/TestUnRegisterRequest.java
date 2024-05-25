package com.tco.requests;
//import com.tco.database.DatabaseRequest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestUnRegisterRequest {
    
    private UnRegisterRequest unreg;
    @BeforeEach
    public void setup() {
        
    }

    @Test
    @DisplayName("test UnRegisterRequest=true")
    public void testunRegisterValid() {
        unreg=new UnRegisterRequest("Testing231","TestingP231");
        DatabaseRequest db =  DatabaseRequest.getDatabase();
        db.addUserToDatabase("Testing231","TestingP231");
        assertEquals(db.checkUsernameInDatabase("Testing231"),true);
        unreg.buildResponse();
        assertEquals(unreg.getUnRegisterSuccess(),true);
        assertEquals(db.checkUsernameInDatabase("Testing231"),false);

    }
    @Test
    @DisplayName("test UnRegisterRequest=false")
    public void testunRegisterUserInvalid() {
        unreg=new UnRegisterRequest("Testing231","TestingP231");
        DatabaseRequest db = DatabaseRequest.getDatabase();
        assertEquals(db.checkUsernameInDatabase("Testing231"),false);
        unreg.buildResponse();
        assertEquals(unreg.getUnRegisterSuccess(),false);


    }
}
