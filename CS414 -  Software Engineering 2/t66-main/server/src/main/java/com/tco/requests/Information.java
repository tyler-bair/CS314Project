package com.tco.requests;

//import com.tco.database.DatabaseRequest;
//import com.tco.database.History;
import java.util.List;
import java.util.ArrayList;
public class Information {

    public ArrayList<History> matchHistory = new ArrayList<>();
    private DatabaseRequest db = DatabaseRequest.getDatabase();
    private String username;

    public Information(String username){
        this.username = username;
    }

    public ArrayList<History> buildMatchHistory(){
       matchHistory = db.buildUserMatchHistory(username);
       return matchHistory;
    }

    public InformationIterator getIterator(){
        return new InformationIterator();
    }

    public class InformationIterator {
        int index;

        public boolean hasNext(){
            if(index < matchHistory.size()){
                return true;
            }
            return false;
        }

        public History next(){
            if(this.hasNext()){
                return matchHistory.get(index++);
            }
            return null;
        }

    }

    }