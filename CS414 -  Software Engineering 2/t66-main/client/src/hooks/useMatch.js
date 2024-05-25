import { getOriginalServerUrl, sendAPIRequest } from '../utils/restfulAPI'

export default function useMatch(){
  
  const checkMatch = async (username1, username2, matchAction, matchID, fenState ) => {
    const serverURL = getOriginalServerUrl();

    try {
      const registerResponse = await makeMatchRequest(username1, username2, matchAction, matchID, fenState, serverURL);

      if(registerResponse) {
        console.log(`Match request to ${serverURL} successful`);
        return registerResponse;

      }
      else {
        console.error(`Match request to ${serverURL} failed.`);
      }
    } catch (error) {
      console.error("Error while requesting match action.", error);
    }
  };
  return { checkMatch };
}

async function makeMatchRequest(username1, username2, matchAction, matchID, fenState, serverURL) {
  const requestBody = {requestType: 'match', userName_1: username1, userName_2: username2, matchAction: matchAction, matchID: matchID, fenState: fenState};

  try { 
    const registerResponse = await sendAPIRequest(requestBody, serverURL);
    return registerResponse;

  } 
  catch (error) {
    console.error("Error while requesting match action.", error);
    return null;
  }
}