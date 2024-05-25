package com.tco.requests.gameManagement;
import com.tco.requests.DatabaseRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestManageMatch {
    private DatabaseRequest db = DatabaseRequest.getDatabase();


     @Test
     @DisplayName("maur88: testing that ManageMatch is created")
     public void testManageMatch() {
         ManageMatch manageMatchRequest = new ManageMatch("user1", "user2", "join",123,"rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2");
            assertEquals(manageMatchRequest.getClass(), ManageMatch.class);
     }

     @Test
     @DisplayName("maur88: testing that ManageMatch is created with both usernames no matchid")
     public void testManageMatchBothUsernames() {
         ManageMatch manageMatchRequest = new ManageMatch("user1", "user2");
         assertEquals(manageMatchRequest.getClass(), ManageMatch.class);
         db.runAnyQuery("DELETE FROM matches WHERE match_id = ?",List.of(manageMatchRequest.getMatchID()));
        }
     @Test
     @DisplayName("maur88: testing that ManageMatch is created with one username")
    public void testManageMatchOneUsername() {
        ManageMatch manageMatchRequest = new ManageMatch("user1", "join");
        assertEquals(manageMatchRequest.getClass(), ManageMatch.class);
         db.runAnyQuery("DELETE FROM matches WHERE match_id = ?",List.of(manageMatchRequest.getMatchID()));
     }
    @Test
    @DisplayName("maur88: createMatch test")
    public void testCreateMatch() {
        ManageMatch manageMatchRequest = new ManageMatch("user1", "create");
        assertEquals(manageMatchRequest.getClass(), ManageMatch.class);
        db.runAnyQuery("DELETE FROM matches WHERE match_id = ?",List.of(manageMatchRequest.getMatchID()));
    }
    @Test
    @DisplayName("maur88: leaveMatch test")
    public void testLeaveMatch() {
        ManageMatch manageMatchRequest = new ManageMatch("user1", "leave");
        assertEquals(manageMatchRequest.getClass(), ManageMatch.class);

        db.runAnyQuery("DELETE FROM matches WHERE match_id = ?",List.of(manageMatchRequest.getMatchID()));
    }
    @Test
    @DisplayName("maur88: Test createMatch method")
    public void testCreateMatchMethod() {
        String user1 = "user11";
        String user2 = "user21";
        ManageMatch manageMatchRequest = new ManageMatch(user1, user2);

        manageMatchRequest.createMatch();

        String expectedResponse = "Successfully created match.";
        String actualResponse = manageMatchRequest.getResponse();
        assertEquals(expectedResponse, actualResponse, "The response should indicate the match was successfully created.");
        DatabaseRequest db = DatabaseRequest.getDatabase();
        db.runAnyQuery("DELETE FROM matches WHERE match_id = ?",List.of(manageMatchRequest.getMatchID()));

    }

    @Test
    @DisplayName("maur88: Test joining a non-existing match")
    public void testJoinNonExistingMatch() {
        int nonExistingMatchID = -1;
        ManageMatch manageMatch = new ManageMatch("user1", "join", Integer.toString(nonExistingMatchID));
        manageMatch.joinMatch(-1);
        String response = manageMatch.getResponse();
        assertEquals("Failed to join match. Match does not exist.", response, "Response should indicate failure due to non-existing match.");
    }

    @Test
    @DisplayName("maur88: Test joining a match already joined by the user")
    public void testJoinAlreadyJoinedMatch() {
        int alreadyJoinedMatchID = 1;
        ManageMatch manageMatch = new ManageMatch("user1", "join", alreadyJoinedMatchID);
        manageMatch.joinMatch(alreadyJoinedMatchID);
        String response = manageMatch.getResponse();
        assertEquals("Failed to join match. Match is full.", response, "Response should indicate failure due to already being in the match.");
    }

    @Test
    @DisplayName("maur88: Test successfully joining a match")
    public void testSuccessfulJoinMatch() {
        int joinableMatchID = 338;
        ManageMatch manageMatch = new ManageMatch("test", "join",joinableMatchID);
        String response = manageMatch.getResponse();
        assertEquals("Successfully joined match.", response, "Response should indicate successful joining of the match.");
        String query = "UPDATE matches SET user2_id = \"\" WHERE match_id = ?";
        List<Object> params = List.of(joinableMatchID);
        DatabaseRequest db = DatabaseRequest.getDatabase();
        db.runAnyQuery(query, params);
    }
    @Test
    @DisplayName("maur88: Test leaving a non-existent match")
    public void testLeaveNonExistentMatch() {
        int nonExistentMatchID = -1;
        ManageMatch manageMatch = new ManageMatch("user1", "leave", nonExistentMatchID);
        manageMatch.leaveMatch(nonExistentMatchID);
        String response = manageMatch.getResponse();
        assertEquals("Failed to leave match. Match does not exist or invalid match data.", response, "Response should indicate failure due to non-existing match.");
    }

    @Test
    @DisplayName("maur88: Test leaving a match as the only user")
    public void testLeaveMatchAsOnlyUser() {
        int matchID = 453;
        String[] initialUsers = saveInitialState(matchID);
        System.out.println(initialUsers[0] + " " + initialUsers[1]);
        ManageMatch manageMatch = new ManageMatch(initialUsers[0], "leave", matchID);
        String response = manageMatch.getResponse();
        assertEquals("User successfully removed from match.", response, "Response should indicate successful user removal from the match.");

        restoreInitialState(matchID, initialUsers);
    }

    @Test
    @DisplayName("maur88: Test leaving a match as two users")
    public void testLeaveMatchAsOneOfTwoUsers() {
        int matchID = 455;
        String[] initialUsers = saveInitialState(matchID);
        ManageMatch manageMatch = new ManageMatch(initialUsers[0],initialUsers[1], "leave", matchID,"");
        String response = manageMatch.getResponse();
        restoreInitialState(matchID, initialUsers);
        assertEquals("Both users successfully removed from match.", response, "Response should indicate successful user removal from the match.");

    }

    private String[] saveInitialState(int matchID) {
        DatabaseRequest db =  DatabaseRequest.getDatabase();
        List<List<String>> result = db.runMultiColumnQuery("SELECT user1_id, user2_id FROM matches WHERE match_id = ?", List.of(matchID));
        if (result.size() == 1) {
            return new String[]{result.get(0).get(0), result.get(0).get(1)};
        }
        return new String[]{"", ""};
    }

    private void restoreInitialState(int matchID, String[] initialUsers) {
        DatabaseRequest db =  DatabaseRequest.getDatabase();
        db.runAnyQuery("UPDATE matches SET user1_id = ?, user2_id = ? WHERE match_id = ?", List.of(initialUsers[0], initialUsers[1], matchID));
    }




}
