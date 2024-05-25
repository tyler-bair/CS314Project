import React, { useState } from 'react'
import { getOriginalServerUrl, sendAPIRequest } from '../utils/restfulAPI'

export default function useRegister(){
  
  const addUser = async (username, password) => {
    const serverURL = getOriginalServerUrl();

    try {
      const registerResponse = await makeRegisterRequest(username, password, serverURL);

      if(registerResponse.registrationSuccess == "true") {
        //Will add success pop up here.
        //document.getElementById("ELEMENT NAME HERE").textContent = "Successfully registered!"
        console.log("successfully added user");
        return registerResponse.registrationSuccess;
      } else {
        return registerResponse.responseMessage

      }
    } catch (error) {
      console.error("Error while registering user", error);
    }
  };
  return { addUser };
}

async function makeRegisterRequest(username, password, serverURL) {
  const requestBody = {requestType: 'user', username: username, password: password };

  try { 
    const registerResponse = await sendAPIRequest(requestBody, serverURL);
    return registerResponse;
  } catch (error) {
    console.error("Error while registering user", error);
    return null;
  }
}

