package com.tco.requests.gameManagement;

import com.tco.requests.*;
import com.tco.requests.DatabaseRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManageMatch {
    private int matchID;
    private DatabaseRequest db = DatabaseRequest.getDatabase();
    private String userName_1;
    private String userName_2;
    private String response;
    private String fenState;

    public ManageMatch(String userName_1, String matchAction) {
        this(userName_1, "", matchAction, -1,"");
    }
    public ManageMatch(String userName_1, String userName_2, String matchAction) {
        this(userName_1, userName_2, matchAction, -1,"");
    }
    public ManageMatch(String userName_1, String userName_2, String matchAction, int matchID, String fenState) {
        this.userName_1 = userName_1;
        this.userName_2 = userName_2;
        this.matchID = matchID;
        this.fenState = fenState;
        handleAction(matchAction, matchID);
    }

    public ManageMatch(String userName_1, String matchAction, int joinableMatchID) {
        this.userName_1 = userName_1;
        this.userName_2 = "";
        this.matchID = joinableMatchID;
        handleAction(matchAction, joinableMatchID);
        fenState = "";
    }

    private void handleAction(String matchAction, int matchID) {
        MatchCommand command;
        switch (matchAction.toLowerCase()) {
            case "create":
                command = new CreateMatchCommand(this);
                break;
            case "join":
                command = new JoinMatchCommand(this, matchID);
                break;
            case "leave":
                command = new LeaveMatchCommand(this, matchID);
                break;
            default:
                response = "Invalid action. Please choose either 'create', 'join', or 'leave'.";
                return;
        }
        command.execute();
    }

    public void createMatch() {
        ArrayList<Object> params = new ArrayList<>();
        params.add(userName_1);
        params.add(userName_2);
        params.add(fenState);
        Integer matchID1=db.getNextMatchID();
        params.add(db.getNextMatchID());
        String query = "INSERT INTO matches (user1_id, user2_id, fen_state, MatchID) VALUES (?, ?, ?, ?)";
        try {
            db.runAnyQuery(query, params);
            this.matchID = matchID1;
            this.response = "Successfully created match.";
        } catch (Exception e) {
            this.response = "Failed to create match." + e.getMessage();
        }
    }

    public void joinMatch(int matchID) {
        List<List<String>> matchUsersResult = fetchMatchUsers(matchID);
        this.matchID = matchID;
        if (matchUsersResult.isEmpty()) {
            this.response = "Failed to join match. Match does not exist.";
            return;
        }

        processJoinRequest(matchUsersResult, matchID);
    }

    private void processJoinRequest(List<List<String>> users, int matchID) {
        if (users.size() != 1 ) {
            this.response = "Failed to join match. Invalid match data.";
            return;
        }
        String existingUser1 = users.get(0).get(0);
        String existingUser2 = users.get(0).get(1);
        this.fenState = users.get(0).get(2);


        if ( existingUser1 !=  null && !existingUser1.isEmpty() && existingUser2 != null && !existingUser2.isEmpty()) {
            this.response = "Failed to join match. Match is full.";
            return;
        }
            updateMatchUsers(userName_1, matchID);
    }


    private List<List<String>> fetchMatchUsers(int matchID) {
        String query = "SELECT user1_id, user2_id, fen_state FROM matches WHERE match_id = ?";
        List<Object> params = new ArrayList<>();
        params.add(matchID);
        return db.runMultiColumnQuery(query, params);
    }
    private void updateMatchUsers(String user2, int matchID) {
        String query = "UPDATE matches SET user2_id = ? WHERE match_id = ?";
        List<Object> params = new ArrayList<>();
        params.add(user2);
        params.add(matchID);
        db.runAnyQuery(query, params);
        this.response = "Successfully joined match.";

    }
    public void leaveMatch(int matchID) {
        List<List<String>> matchUsersResult = fetchMatchUsers(matchID);
        this.matchID = matchID;

        if (isInvalidMatchData(matchUsersResult)) {
            setResponseAndReturn("Failed to leave match. Match does not exist or invalid match data.");
            return;
        }

        String existingUser1 = matchUsersResult.get(0).get(0);
        String existingUser2 = matchUsersResult.get(0).get(1);


        if (areBothUsersEmpty(existingUser1, existingUser2)) {
            setResponseAndReturn("No users to remove from the match.");
            return;
        }

        processUserRemoval(matchID, existingUser1, existingUser2);
    }


    private boolean isInvalidMatchData(List<List<String>> matchUsersResult) {
        return matchUsersResult.size() != 1;
    }

    private boolean areBothUsersEmpty(String user1, String user2) {
        return (user1 == null || user1.isEmpty()) && (user2 == null || user2.isEmpty());
    }

    private void processUserRemoval(int matchID, String existingUser1, String existingUser2) {

        if (shouldRemoveBothUsers(existingUser1, existingUser2)) {
            removeBothUsers(matchID);
        } else {
            handleSingleUserRemoval(matchID, existingUser1, existingUser2);
        }
    }

    private boolean shouldRemoveBothUsers(String user1, String user2) {
        if (!user1.equals(userName_1) && !user2.equals(userName_2)) {
            setResponseAndReturn("No matching users found to remove from the match.");
        }
        return !user1.isEmpty() && !user2.isEmpty();
    }

    private void handleSingleUserRemoval(int matchID, String existingUser1, String existingUser2) {

        if (isUserMatching(existingUser1, userName_1)) {
            removeSingleUser(matchID, "user1_id");
        } else if (isUserMatching(existingUser2, userName_2)) {
            removeSingleUser(matchID, "user2_id");
        } else {
            setResponseAndReturn("No matching users found to remove from the match.");
        }
    }
    private boolean isUserMatching(String existingUser, String currentUser) {
        return Objects.equals(existingUser, currentUser);
    }
    private void setResponseAndReturn(String message) {
        this.response = message;
    }
    private void removeBothUsers(int matchID) {
        String query = "UPDATE matches SET user1_id = \"\", user2_id = \"\" WHERE match_id = ?";
        List<Object> params = new ArrayList<>();
        params.add(matchID);
        db.runAnyQuery(query, params);
        this.response = "Both users successfully removed from match.";
    }
    private void removeSingleUser(int matchID, String userColumn) {
        String query = String.format("UPDATE matches SET %s = \"\" WHERE match_id = ?", userColumn);
        List<Object> params = new ArrayList<>();
        params.add(matchID);
        db.runAnyQuery(query, params);
        this.response = "User successfully removed from match.";
    }


    public int getMatchID() {
        String query = "SELECT match_id FROM matches WHERE user1_id = ? AND user2_id = ? ORDER BY match_id DESC LIMIT 1";
        List<Object> params = new ArrayList<>();
        params.add(userName_1);
        params.add(userName_2);
        ArrayList<String> result = db.runAnyQuery(query, params);

        if (!result.isEmpty()) {
            return Integer.parseInt(result.get(0));
        } else {
            this.response = "Failed to retrieve match ID.";
            return -1;
        }
    }


    public String getResponse() {
        return response;
    }

    public String getFenState() {
        return fenState;
    }
}
