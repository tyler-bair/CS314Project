package com.tco.requests.gameManagement;

public class CreateMatchCommand implements MatchCommand {
    private ManageMatch manageMatch;

    public CreateMatchCommand(ManageMatch manageMatch) {
        this.manageMatch = manageMatch;
    }

    @Override
    public void execute() {
        manageMatch.createMatch();
    }
}
