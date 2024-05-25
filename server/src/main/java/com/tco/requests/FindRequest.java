package com.tco.requests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tco.misc.Database;
import com.tco.requests.Places;

public class FindRequest extends Request {
	private static final transient Logger log = LoggerFactory.getLogger(FindRequest.class);

    private String match;
    private int limit;
    private int found;
    private Places places;

    public FindRequest(String match, int limit){
        super();
        this.requestType = "find";
        this.match = match;
        this.limit = limit;
    }

    @Override
	public void buildResponse() {
        try{
            places = Database.places(match, limit);
            found = Database.found(match);
        }
        catch(Exception e){}
        log.trace("buildResponse -> {}", this);

        //Need to make the json here I'm pretty sure
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}