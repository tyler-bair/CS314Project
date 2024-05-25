package com.tco.requests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class TestDatabaseRequest {

    private DatabaseRequest Datab;

    @BeforeEach
    public void setup() {
        Datab = DatabaseRequest.getDatabase();
    }
/*  Use to make sure your enviornmental variables are set up correctly 
    @Test
    @DisplayName("colejd: DatabaseRequest create Database")
    public void testDatabaseBuild() {
     
        assertEquals(Datab.Usertest,"Your username");
        assertEquals(Datab.Userpass,"Your pasword");
    }
*/
@Test
    @DisplayName("colejd: DatabaseRequest checkUserInDatabase")
    public void testcheckUsernameInDatabase() {
     assertEquals(Datab.checkUsernameInDatabase("testUser"),true);
     assertEquals(Datab.checkUsernameInDatabase("testBadUserNotReal3242341"),false);
     //string random that isnt in database
    assertEquals(Datab.checkLoginInDatabase("testUfwgvdfgvdh3241ffdh4ser","te24323rstP3r3rffwass"),false);
    }
  
    @Test
    @DisplayName("colejd: DatabaseRequest checkUserInDatabase")
    public void testcheckLoginInDatabase() {
     assertEquals(Datab.checkLoginInDatabase("testUser","testPass"),true);
     assertEquals(Datab.checkLoginInDatabase("testUser","testBadPassNotReal"),false);
     assertEquals(Datab.checkLoginInDatabase("testBadUserNotReal","testPass"),false);
     //string random that isnt in database
    assertEquals(Datab.checkLoginInDatabase("testUfwgvdfgvdh3241ffdh4ser","te24323rstP3r3rffwass"),false);
    }

    @Test
    @DisplayName("colejd: DatabaseRequest checkUserInDatabase")
    public void testaddUserToDatabase() {
        Datab.addUserToDatabase("testUser2","testPass2");
        assertEquals(Datab.checkLoginInDatabase("testUser2","testPass2"),true);
        assertEquals(Datab.removeUserFromDatabase("testUser2","testPass2"),true);
        assertEquals(Datab.checkLoginInDatabase("testUser2","testPass2"),false);

    }

    @Test
    @DisplayName("colejd: test addToMatchHistory")
    public void testaddToMatchHistory() {
        String testU="testingAddToMatchU";
        String testP="testingAddToMatchP";
        String testUO="testingAddToMatchUO";
        String testPO="testingAddToMatchPO";
        Datab.addUserToDatabase(testU,testP);
        Datab.addUserToDatabase(testUO,testPO);
        
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),true);
        Datab.deleteFromMatchHistory(00001);
        assertEquals(Datab.checkMatchHistory(00001),false);

        Datab.removeUserFromDatabase(testU,testP);
        Datab.removeUserFromDatabase(testUO,testPO);
    }
    @Test
    @DisplayName("colejd: test bad addToMatchHistory")
    public void testbadaddToMatchHistory() {
        String testU="testingAddToMatchU";
        String testP="testingAddToMatchP";
        String testUO="testingAddToMatchUO";
        String testPO="testingAddToMatchPO";
        Datab.deleteFromMatchHistory(00001);
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),false);

        Datab.addToMatchHistory(null,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(null),false);

        Datab.addUserToDatabase(testU,testP);
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),false);
        Datab.removeUserFromDatabase(testU,testP);

        Datab.addUserToDatabase(testUO,testPO);
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),false);
        Datab.removeUserFromDatabase(testUO,testPO);

        Datab.addUserToDatabase(testU,testP);
        Datab.addUserToDatabase(testUO,testPO);
        Datab.addToMatchHistory(null,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(null),false);
        Datab.addToMatchHistory(00001,testU,testUO,null,testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),false);
        Datab.addToMatchHistory(00001,testU,testUO,null,testU,null,"2053");
        assertEquals(Datab.checkMatchHistory(00001),false);
        Datab.removeUserFromDatabase(testU,testP);
        Datab.removeUserFromDatabase(testUO,testPO);

        
    }

    @Test
    @DisplayName("gcc/colejd: Test buildUserMatchHistory")
    public void testBuildUserMatchHistory() {
        String testU="gcc";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        Datab.deleteFromMatchHistory(00001);
        Datab.addUserToDatabase(testU,testP);
        Datab.addUserToDatabase(testUO,testPO);
        History newHistory= new History(00001,testU,testUO,"Finished",testU,"1901","2053");
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),true);

        ArrayList<History> results= new ArrayList<>();
        results=Datab.buildUserMatchHistory(testU);
        assertEquals((results.get(0)).Username,newHistory.Username);

        Datab.deleteFromMatchHistory(00001);
        assertEquals(Datab.checkMatchHistory(00001),false);

        Datab.removeUserFromDatabase(testU,testP);
        Datab.removeUserFromDatabase(testUO,testPO);
    }
    @Test
    @DisplayName("colejd: Test buildUserMatchHistory with several matches")
    public void testBuildUserMatchHistorySeveralMatches() {
        String testU="gcc";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        Datab.deleteFromMatchHistory(00001);
        Datab.addUserToDatabase(testU,testP);
        Datab.addUserToDatabase(testUO,testPO);
        History newHistory= new History(00001,testU,testUO,"Finished",testU,"1901","2053");
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),true);
        History newHistory2= new History(00002,testU,testUO,"Finished",testU,"1901","2053");
        Datab.addToMatchHistory(00002,testU,testUO,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00002),true);
        
        ArrayList<History> results= new ArrayList<>();
        results=Datab.buildUserMatchHistory(testU);
        assertEquals((results.get(1)).MatchID,newHistory.MatchID);
        assertEquals((results.get(0)).MatchID,newHistory2.MatchID);

        Datab.deleteFromMatchHistory(00001);
        Datab.deleteFromMatchHistory(00002);
        assertEquals(Datab.checkMatchHistory(00001),false);
        assertEquals(Datab.checkMatchHistory(00002),false);

        Datab.removeUserFromDatabase(testU,testP);
        Datab.removeUserFromDatabase(testUO,testPO);
    }
    @Test
    @DisplayName("colejd: Test buildUserMatchHistory where user is opponent in one match but main player in other")
    public void testBuildUserMatchHistoryOpponent() {
        String testU="gcc";
        String testP="abc";
        String testUO="ccg";
        String testPO="cba";
        Datab.deleteFromMatchHistory(00001);
        Datab.addUserToDatabase(testU,testP);
        Datab.addUserToDatabase(testUO,testPO);
        History newHistory= new History(00001,testU,testUO,"Finished",testU,"1901","2053");
        Datab.addToMatchHistory(00001,testU,testUO,"Finished",testU,"1901","2053");
        History newHistory2= new History(00002,testUO,testU,"Finished",testU,"1901","2053");
        Datab.addToMatchHistory(00002,testUO,testU,"Finished",testU,"1901","2053");
        assertEquals(Datab.checkMatchHistory(00001),true);
        assertEquals(Datab.checkMatchHistory(00002),true);

        ArrayList<History> results= new ArrayList<>();
        results=Datab.buildUserMatchHistory(testU);
        assertEquals((results.get(1)).Username,newHistory.Username);
        assertEquals((results.get(0)).Username,newHistory2.Username);

        Datab.deleteFromMatchHistory(00001);
        assertEquals(Datab.checkMatchHistory(00001),false);
        Datab.deleteFromMatchHistory(00002);
        assertEquals(Datab.checkMatchHistory(00002),false);

        Datab.removeUserFromDatabase(testU,testP);
        Datab.removeUserFromDatabase(testUO,testPO);
    }
    @Test
    @DisplayName("maur88: testing runAnyQuery")
    public void testRunAnyQuery() {
        String query = "SELECT * FROM UserLogin WHERE Username = ?;";
        List<Object> params = new ArrayList<>();
        params.add("abc");

        ArrayList<String> result = Datab.runAnyQuery(query, params);
//        System.out.println(result);
        assertNotNull(result, "The result should not be null.");
        assertFalse(result.isEmpty(), "The result should not be empty if 'abc' exists in the UserLogin table.");

    }
    @Test
	@DisplayName("colejd: Test updateMatchHistory")
	public void testupdateMatchHistory() {
    	String testU="gcc2";
    	String testP="abc2";
    	String testUO="ccg2";
    	String testPO="cba2";
        Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);
    	Datab.deleteFromMatchHistory(0000001);
    	Datab.addUserToDatabase(testU,testP);
    	Datab.addUserToDatabase(testUO,testPO);
    	History newHistory= new History(0000001,testU,testUO,"Bad",testU,"1901","2053");
    	Datab.addToMatchHistory(0000001,testU,testUO,"Bad",testU,"1901","2053");
    	assertEquals(Datab.checkMatchHistory(0000001),true);

    	ArrayList<History> results= new ArrayList<>();
    	results=Datab.buildUserMatchHistory(testU);
    	assertEquals((results.get(0)).Winner,newHistory.Winner);

        ArrayList<History> results3= new ArrayList<>();
    	Datab.updateMatchHistory(0000001,"unfinished","");
    	results3=Datab.buildUserMatchHistory(testU);

    	for(int i=0;i<results3.size();i++){
            if(results3.get(i).MatchID==0000001){
                assertEquals(results3.get(i).MatchStatus,"unfinished");
            }
        }

        ArrayList<History> results2= new ArrayList<>();
    	Datab.updateMatchHistory(0000001,"finished",testUO);
    	results2=Datab.buildUserMatchHistory(testU);

    	for(int i=0;i<results2.size();i++){
            if(results2.get(i).MatchID==0000001){
                assertEquals(results2.get(i).MatchStatus,"finished");
                assertEquals(results2.get(i).Winner,testUO);
            }
        }
        

    	Datab.deleteFromMatchHistory(0000001);
    	assertEquals(Datab.checkMatchHistory(0000001),false);

    	Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);
	}

@Test
@DisplayName("colejd: Test Date")
	public void testDate() {
        String testU="gcc2";
    	String testP="abc2";
    	String testUO="ccg2";
    	String testPO="cba2";
        Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);
    	Datab.deleteFromMatchHistory(0000001);
    	Datab.addUserToDatabase(testU,testP);
    	Datab.addUserToDatabase(testUO,testPO);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   		Date date = new Date(); 

           
    	Datab.addToMatchHistory(0000001,testU,testUO,"Bad",testU,"","");

        ArrayList<History> results= new ArrayList<>();
        results=Datab.buildUserMatchHistory(testU);
        assertEquals((results.get(0)).StartDate,formatter.format(date));

        Datab.deleteFromMatchHistory(0000001);
    	assertEquals(Datab.checkMatchHistory(0000001),false);
    	Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);

    }
    @Test
    @DisplayName("maur88: testing runMultiColumnQuery getting first entry in matches")
     public void testRunMultiColumnQueryOnMatchesTable() {
        DatabaseRequest dbRequest =  DatabaseRequest.getDatabase();
        String query = "SELECT user1_id, user2_id, fen_state FROM matches WHERE match_id = ?";
        List<Object> params = new ArrayList<>();
        params.add(1);

        List<List<String>> results = dbRequest.runMultiColumnQuery(query, params);

        assertNotNull(results, "Results should not be null");
        assertFalse(results.isEmpty(), "Results should not be empty");
        assertEquals(1, results.size(), "Should return exactly one row for a specific match_id");

        List<String> firstRow = results.get(0);

        assertEquals("1", firstRow.get(0), "First column (user1_id) should match expected user ID");
        assertEquals("user1", firstRow.get(1), "Second column (user2_id) should match expected user ID");
        assertEquals("5rk1/pp3ppp/8/2p2P2/4n1PP/8/PP2q3/2Kr4 w - - 11 32", firstRow.get(2), "Third column (fen_state) should match expected FEN state");

    }

    @Test
	@DisplayName("colejd: Test getNextMatchID")
	public void testgetNextMatchID() {
    	String testU="gcc2";
    	String testP="abc2";
    	String testUO="ccg2";
    	String testPO="cba2";
        Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);
    	Datab.deleteFromMatchHistory(1111111);
    	Datab.addUserToDatabase(testU,testP);
    	Datab.addUserToDatabase(testUO,testPO);
    	Datab.addToMatchHistory(1111111,testU,testUO,"Bad",testU,"1901","2053");
        assertEquals(Datab.getNextMatchID(),1111112);

        Datab.deleteFromMatchHistory(1111111);
    	Datab.removeUserFromDatabase(testU,testP);
    	Datab.removeUserFromDatabase(testUO,testPO);
    }

}
