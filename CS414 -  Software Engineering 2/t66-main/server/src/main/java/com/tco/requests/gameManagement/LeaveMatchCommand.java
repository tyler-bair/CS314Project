package com.tco.requests.gameManagement;

public class LeaveMatchCommand implements MatchCommand {
    private ManageMatch manageMatch;
    private int matchID;

    public LeaveMatchCommand(ManageMatch manageMatch, int matchID) {
        this.manageMatch = manageMatch;
        this.matchID = matchID;
    }

    @Override
    public void execute() {
        manageMatch.leaveMatch(matchID);
    }
}
