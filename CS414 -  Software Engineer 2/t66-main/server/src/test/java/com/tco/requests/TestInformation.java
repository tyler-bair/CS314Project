package com.tco.requests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
//import com.tco.database.DatabaseRequest;
import com.tco.requests.Information.InformationIterator;
import java.util.List;
import java.util.ArrayList;

public class TestInformation {

    private Information info;
    private DatabaseRequest db;

    @BeforeEach
    public void setup() {
        info = new Information("usernameUnique");
        db = DatabaseRequest.getDatabase();
    }

    @Test
    @DisplayName("gcc: Testing Build Match History")
    public void testBuildMatchHistory() {
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);

        info.buildMatchHistory();
        assertEquals((info.matchHistory.get(0)).OpponentUsername, testUO);

        db.deleteFromMatchHistory(00001);
        assertEquals(db.checkMatchHistory(00001),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }


    @Test
    @DisplayName("gcc: Testing Build Multiple Match History")
    public void testBuildMultipleMatchHistory() {
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00002,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00003,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);
        assertEquals(db.checkMatchHistory(00002),true);
        assertEquals(db.checkMatchHistory(00003),true);

        info.buildMatchHistory();
        assertEquals((info.matchHistory.get(0)).MatchID, 00003);
        assertEquals((info.matchHistory.get(1)).MatchID, 00002);
        assertEquals((info.matchHistory.get(2)).MatchID, 00001);

        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        db.deleteFromMatchHistory(00003);
        assertEquals(db.checkMatchHistory(00001),false);
        assertEquals(db.checkMatchHistory(00002),false);
        assertEquals(db.checkMatchHistory(00003),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }

    @Test
    @DisplayName("gcc: Testing InformationIterator")
    public void testInfoIterator() {
        String testU="usernameUnique";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        db.addUserToDatabase(testU,testP);
        db.addUserToDatabase(testUO,testPO);
        
        db.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00002,testU,testUO,"Finished",testU,"1901","2053");
        db.addToMatchHistory(00003,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(db.checkMatchHistory(00001),true);
        assertEquals(db.checkMatchHistory(00002),true);
        assertEquals(db.checkMatchHistory(00003),true);

        info.buildMatchHistory();
        int i = 0;
        for(InformationIterator iter = info.getIterator(); iter.hasNext(); i++){
            assertEquals((info.matchHistory.get(i)).MatchID, iter.next().MatchID);
        }

        db.deleteFromMatchHistory(00001);
        db.deleteFromMatchHistory(00002);
        db.deleteFromMatchHistory(00003);
        assertEquals(db.checkMatchHistory(00001),false);
        assertEquals(db.checkMatchHistory(00002),false);
        assertEquals(db.checkMatchHistory(00003),false);

        db.removeUserFromDatabase(testU,testP);
        db.removeUserFromDatabase(testUO,testPO);
    }


}
