package com.tco.requests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class DatabaseRequest {

	private Connection conn = null;
	private PreparedStatement nameStatement = null;
	private PreparedStatement countStatement = null;
	private Statement test = null;
	public String Usertest=null;
	public String Userpass =null;
	private static DatabaseRequest single_instance = null;

	private DatabaseRequest() {
		Usertest=Credential.USER;
		Userpass=Credential.PASSWORD;
    	try {
			
        	conn = DriverManager.getConnection(Credential.url(), Credential.USER, Credential.PASSWORD);
        	test = conn.createStatement();
			
    	} catch (SQLException se) {
			
        	log.error("SQL Exception: " + se.getMessage());
    	}
	}
	public static synchronized DatabaseRequest getDatabase(){
        if (single_instance == null){
            single_instance = new DatabaseRequest();
		}
        return single_instance;
    }

	private static Logger log = LoggerFactory.getLogger(DatabaseRequest.class);

	public Boolean checkUsernameInDatabase(String Username){
		Integer result = 0;
    	try {
			
        	ResultSet results = test.executeQuery("Select * from UserLogin where Username= \""+Username+"\";");
			//System.out.println(results);
        	while(results.next()){
            	result=result+1;
        	}
        	
    	} catch (SQLException se){
        	log.error("SQL Exception: " + se.getMessage());
    	}
    	if(result==1){
		return true;
		}
		return false;
	}

	public Boolean checkLoginInDatabase(String Username,String Password){
		Integer result = 0;
    	try {
			
        	ResultSet results = test.executeQuery("Select * from UserLogin where Username= \""+Username+"\" AND Password=\""+Password+"\";");
			//System.out.println(results);
        	while(results.next()){
            	result=result+1;
        	}
        	
    	} catch (SQLException se){
        	log.error("SQL Exception: " + se.getMessage());
    	}
    	if(result==1){
		return true;
		}
		return false;
	}
	
	public Boolean addUserToDatabase(String Username,String Password){
		if(checkUsernameInDatabase(Username)==true){
			return false;
		}
		try {
			
		ResultSet results=test.executeQuery("INSERT INTO UserLogin(Username,Password) VALUES (\""+Username+"\",\""+Password+"\"); ");
			} catch (SQLException se){
				log.error("SQL Exception: " + se.getMessage());
			}
		return true;
	
	}
	public Boolean removeUserFromDatabase(String Username,String Password){
		if(checkUsernameInDatabase(Username)==false){
			return false;
		}
		try {
		ResultSet results=test.executeQuery("DELETE FROM UserLogin where Username=\""+Username+"\" AND Password= \""+Password+"\";");
	} catch (SQLException se){
		log.error("SQL Exception: " + se.getMessage());
	}
		return true;
	}
	public Boolean addToMatchHistory(Integer MatchID,String Username,String OpponentUsername,String MatchStatus,String Winner,String StartDate,String EndDate){
		if(MatchID==null||Username==null||checkUsernameInDatabase(Username)==false||checkUsernameInDatabase(OpponentUsername)==false||MatchStatus==null){
			return false;
		}
		if(StartDate==null||StartDate==""){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   		Date date = new Date(); 
		try {
		ResultSet results=test.executeQuery("INSERT INTO MatchHistory(MatchID,OpponentUsername,MatchStatus,Winner,StartDate,EndDate,Username) Values("+MatchID+",\""+OpponentUsername+"\",\""+MatchStatus+"\",\""+Winner+"\",\""+formatter.format(date)+"\",\""+EndDate+"\",\""+Username+"\");");
	} catch (SQLException se){
		log.error("SQL Exception: " + se.getMessage());
		return false;
	}
}else{
	try{
	ResultSet results=test.executeQuery("INSERT INTO MatchHistory(MatchID,OpponentUsername,MatchStatus,Winner,StartDate,EndDate,Username) Values("+MatchID+",\""+OpponentUsername+"\",\""+MatchStatus+"\",\""+Winner+"\",\""+StartDate+"\",\""+EndDate+"\",\""+Username+"\");");
	} catch (SQLException se){
		log.error("SQL Exception: " + se.getMessage());
		return false;
	}
}
		return true;
	}
	public Boolean deleteFromMatchHistory(Integer MatchID){
		if(MatchID==null){
			return false;
		}
		try {
		ResultSet results=test.executeQuery("Delete FROM MatchHistory WHERE MatchID="+MatchID+";");
	} catch (SQLException se){
		log.error("SQL Exception: " + se.getMessage());
		return false;
	}
		return true;
	}
	public Boolean checkMatchHistory(Integer MatchID){
		if(MatchID==null){
			return false;
		}
		Integer result = 0;
    	try {
			
        	ResultSet results = test.executeQuery("Select * from MatchHistory WHERE MatchID="+MatchID+";");
			//System.out.println(results);
        	while(results.next()){
            	result=result+1;
        	}
        	
    	} catch (SQLException se){
        	log.error("SQL Exception: " + se.getMessage());
    	}
    	if(result==1){
		return true;
		}
		return false;
	}

	public ArrayList<History> buildUserMatchHistory(String username){
			ArrayList<History> resultsList = new ArrayList<>();
			
		try {
        	ResultSet results = test.executeQuery("Select * from MatchHistory WHERE Username=\'" + username + "\' OR OpponentUsername=\'"+username+"\' ORDER BY MatchID DESC;");
			//resultsList = null;
			while (results.next()) {
				//String history=results.getString("Username");
				//System.out.println(history);

				History tempHist=new History(Integer.valueOf(results.getString("MatchID")),results.getString("Username"),results.getString("OpponentUsername"),results.getString("MatchStatus"),results.getString("Winner"),results.getString("StartDate"),results.getString("EndDate"));
            	//System.out.println(tempHist.Username);
				resultsList.add(tempHist);
            }
    	} catch (SQLException se){
        	log.error("SQL Exception: " + se.getMessage());
			resultsList = null;
		}
		//System.out.println(resultsList.get(0));
		return resultsList;

	}
	public ArrayList<String> runAnyQuery(String query, List<Object> params) {
		ArrayList<String> resultsList = new ArrayList<>();
		try {
			tryWithResources(query, params, resultsList);
		} catch (SQLException se) {
			log.error("SQL Exception: " + se.getMessage());
		}
		return resultsList;
	}

	private void tryWithResources(String query, List<Object> params, ArrayList<String> resultsList) throws SQLException {
		try (PreparedStatement preparedStatement = conn.prepareStatement(query);
			 ResultSet resultSet = executeQueryWithParameters(preparedStatement, params)) {
			while (resultSet.next()) {
				resultsList.add(resultSet.getString(1));
			}
		}
	}

	private ResultSet executeQueryWithParameters(PreparedStatement preparedStatement, List<Object> params) throws SQLException {
		for (int i = 0; i < params.size(); i++) {
			preparedStatement.setObject(i + 1, params.get(i));
		}
		return preparedStatement.executeQuery();
	}

	public List<List<String>> runMultiColumnQuery(String query, List<Object> params) {
		List<List<String>> resultsList = new ArrayList<>();
		try {
			tryWithResourcesMultiColumn(query, params, resultsList);
		} catch (SQLException se) {
			log.error("SQL Exception: " + se.getMessage());
		}
		return resultsList;
	}

	private void tryWithResourcesMultiColumn(String query, List<Object> params, List<List<String>> resultsList) throws SQLException {
		try (PreparedStatement preparedStatement = conn.prepareStatement(query);
			 ResultSet resultSet = executeQueryWithParameters(preparedStatement, params)) {
			while (resultSet.next()) {
				List<String> row = new ArrayList<>();
				for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
					row.add(resultSet.getString(i));
				}
				resultsList.add(row);
			}
		}
	}

	public Boolean updateMatchHistory(Integer MatchID,String newMatchStatus, String winner){
   	 if(MatchID==null){
   		 return false;
   	 }
   	 Integer result = 0;
		if(newMatchStatus=="finished"){
   	 try {   		 
   		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   		 Date date = new Date();  
   		 ResultSet results = test.executeQuery("UPDATE MatchHistory SET MatchStatus = \'"+newMatchStatus+"\', EndDate = \'"+ formatter.format(date)+"\' , Winner = \'"+ winner +"\'  WHERE MatchID=\'"+MatchID+"\';");
		
   		 //System.out.println(results);
   		 while(results.next()){
       		 result=result+1;
   		 }
   		 
   	 } catch (SQLException se){
   		 log.error("SQL Exception: " + se.getMessage());
   	 }
	}else{
		try{
			ResultSet results = test.executeQuery("UPDATE MatchHistory SET MatchStatus = \'"+newMatchStatus+"\' WHERE MatchID = \'"+MatchID+"\';");
			while(results.next()){
       		 result=result+1;
   		 }
		} catch (SQLException se){
   		 log.error("SQL Exception: " + se.getMessage());
   	 }

	}
   	 if(result==1){
   	 return true;
   	 }
   	 return false;
    }

	public Integer getNextMatchID(){
		Integer result = 0;
    	try {
			
        	ResultSet results = test.executeQuery("Select * from MatchHistory ORDER BY MatchID DESC LIMIT 1;");
			//System.out.println(results);
        	while(results.next()){
            	result=Integer.valueOf(results.getString("MatchID"));
				return result+1;
        	}
        	
    	} catch (SQLException se){
        	log.error("SQL Exception: " + se.getMessage());
    	}
    	
		
		return -1;
	}
}







