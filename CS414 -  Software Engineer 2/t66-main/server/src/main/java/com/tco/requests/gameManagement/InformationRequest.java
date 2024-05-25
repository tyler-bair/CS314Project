package com.tco.requests.gameManagement;

import com.tco.requests.Information;
import com.tco.requests.History;
import java.util.List;
import java.util.ArrayList;

import com.tco.requests.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class InformationRequest extends Request {

    private static final Logger log = LoggerFactory.getLogger(InformationRequest.class);
    public ArrayList<History> matchHistoryAL;
    public History[] matchHistory; 
    private String username;
    private boolean infoSuccess;

    public InformationRequest(String username) {
        this.username = username;
        this.requestType = "info";
    }

    @Override
    public void buildResponse() {
        Information infoHelper = new Information(this.username);
        try {
            this.matchHistoryAL = infoHelper.buildMatchHistory();
            this.infoSuccess = true;
            this.matchHistory = new History[matchHistoryAL.size()];
            this.matchHistory = matchHistoryAL.toArray(this.matchHistory);
        } catch (Exception e) {
            log.error("Exception caught during information request", e);
            this.infoSuccess = false;
        }
        log.trace("buildResponse -> {}", this.getInfoSuccess());

    }
    public History[] getMatchHistory() {
        return this.matchHistory;
    }

    public boolean getInfoSuccess() {
        return this.infoSuccess;
    }


}
