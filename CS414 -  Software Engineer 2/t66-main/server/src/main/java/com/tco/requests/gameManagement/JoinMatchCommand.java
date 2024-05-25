package com.tco.requests.gameManagement;

public class JoinMatchCommand implements MatchCommand {
    private ManageMatch manageMatch;
    private int matchID;

    public JoinMatchCommand(ManageMatch manageMatch, int matchID) {
        this.manageMatch = manageMatch;
        this.matchID = matchID;
    }

    @Override
    public void execute() {
        manageMatch.joinMatch(matchID);
    }
}
