package com.tco.requests;
//import com.tco.database.DatabaseRequest;
import com.tco.misc.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnRegisterRequest extends Request {
    private String username;
    private String password;
    private boolean unRegisterSuccess;
    private String responseMessage;
    private static final transient Logger log = LoggerFactory.getLogger(UnRegisterRequest.class);
    private final DatabaseRequest data = DatabaseRequest.getDatabase();

    @Override
    public void buildResponse() {
        try{
            UnRegister(username, password);
        }
        catch (Exception e){
            log.error("Exception caught while UnRegistering", e);
        }
    }
    public UnRegisterRequest(String username, String password){
        super();
        this.username = username;
        this.password = password;
        this.requestType = "UnRegister";
    }

    public void UnRegister(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()||data.checkUsernameInDatabase(username)==false) {
            unRegisterSuccess=false;
            responseMessage="username is not in Database";
        }
        else {
        
            unRegisterSuccess=data.removeUserFromDatabase(username, password); 
            responseMessage="Successfully removed User";
        }
    }
    public boolean getUnRegisterSuccess(){
        return unRegisterSuccess;
    }
}