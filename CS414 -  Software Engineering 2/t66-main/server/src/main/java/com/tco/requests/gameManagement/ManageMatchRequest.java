package com.tco.requests;

import com.tco.requests.gameManagement.*;

public class ManageMatchRequest extends Request {

    private String userName_1 = "";
    private String userName_2 = "";
    private String matchAction;

    private String responseMessage;

    private String fenState;

    private int matchID;

    public ManageMatchRequest(String userName_1, String userName_2, String matchAction, int matchID, String fenState) {
        this.userName_1 = userName_1;
        this.userName_2 = userName_2;
        this.matchAction = matchAction;
        this.matchID = matchID;
        this.fenState = fenState;
        this.requestType = "manageMatch";
    }

    @Override
    public void buildResponse() {
        ManageMatch mm = new ManageMatch(userName_1, userName_2, fenState);
        MatchCommand command = getCommand(mm, matchAction, matchID);
        if (command != null) {
            command.execute();
            responseMessage = mm.getResponse();
            matchID = mm.getMatchID();
            fenState = mm.getFenState();
        } else {
            responseMessage = "Invalid match action.";
        }
    }

    private MatchCommand getCommand(ManageMatch mm, String action, int matchID) {
        switch (action.toLowerCase()) {
            case "create":
                return new CreateMatchCommand(mm);
            case "join":
                return new JoinMatchCommand(mm, matchID);
            case "leave":
                return new LeaveMatchCommand(mm, matchID);
            default:
                return null;
        }
    }
}
