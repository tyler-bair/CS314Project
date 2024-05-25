package com.tco.requests;

public class History {
    public Integer MatchID;
    public String Username;
    public String OpponentUsername;
    public String MatchStatus;
    public String Winner;
    public String StartDate;
    public String EndDate;

    public History(Integer MatchID,String Username,String OpponentUsername,String MatchStatus,String Winner,String StartDate,String EndDate){
        this.MatchID=MatchID;
        this.Username=Username;
        this.OpponentUsername=OpponentUsername;
        this.MatchStatus=MatchStatus;
        this.Winner=Winner;
        this.StartDate=StartDate;
        this.EndDate=EndDate;
    }
    
}
