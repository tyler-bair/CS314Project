package com.tco.requests.gameManagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.tco.requests.DatabaseRequest;
import java.util.List;
import java.util.ArrayList;
import com.tco.requests.History;

public class TestInformationRequest {
    
    private InformationRequest infoRequest;
    private DatabaseRequest db;

    @BeforeEach
    public void setup() {
        
        infoRequest = new InformationRequest("usernameUnique");
        db = DatabaseRequest.getDatabase();
    }

    @Test
    @DisplayName("gcc: Testing Information Request Build Response")
    public void testBuildMatchHistory() {
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);

        infoRequest.buildResponse();
        assertEquals((infoRequest.matchHistory[0]).OpponentUsername, testUO);

        db.deleteFromMatchHistory(00001);
        assertEquals(db.checkMatchHistory(00001),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }


    @Test
    @DisplayName("gcc: Testing InformationRequest with multiple history matches")
    public void testBuildTwoMatchHistory() {
        
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00002,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);
        assertEquals(db.checkMatchHistory(00002),true);

        infoRequest.buildResponse();
        assertEquals((infoRequest.matchHistory[0]).OpponentUsername, testUO);
        assertEquals((infoRequest.matchHistory[0]).MatchID, 00002);
        assertEquals((infoRequest.matchHistory[1]).OpponentUsername, testUO);
        assertEquals((infoRequest.matchHistory[1]).MatchID, 00001);

        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        assertEquals(db.checkMatchHistory(00001),false);
        assertEquals(db.checkMatchHistory(00002),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }

    @Test
    @DisplayName("gcc: Testing getter methods")
    public void testGetters() {
        
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        History[] testMatchHistory;
        boolean testInfoSuccess;
        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00002,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);
        assertEquals(db.checkMatchHistory(00002),true);

        infoRequest.buildResponse();

        testMatchHistory = infoRequest.getMatchHistory();
        testInfoSuccess = infoRequest.getInfoSuccess();
        
        assertEquals(testInfoSuccess, true);
        assertEquals((testMatchHistory[0]).OpponentUsername, testUO);
        assertEquals((testMatchHistory[0]).MatchID, 00002);
        assertEquals((testMatchHistory[1]).OpponentUsername, testUO);
        assertEquals((testMatchHistory[1]).MatchID, 00001);

        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        assertEquals(db.checkMatchHistory(00001),false);
        assertEquals(db.checkMatchHistory(00002),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }

}
