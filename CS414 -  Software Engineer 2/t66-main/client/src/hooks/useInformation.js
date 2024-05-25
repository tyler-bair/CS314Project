import { getOriginalServerUrl, sendAPIRequest } from '../utils/restfulAPI'

export default function useInformation(){
  
  const checkInformation = async (username) => {
    const serverURL = getOriginalServerUrl();

    try {
      const registerResponse = await makeInformationRequest(username, serverURL);

      if(registerResponse) {
        console.log(`Information request to ${serverURL} successful`);
        return registerResponse;

      }
      else {
        console.error(`Information request to ${serverURL} failed.`);
      }
    } catch (error) {
      console.error("Error while retrieving information.", error);
    }
  };
  return { checkInformation };
}

async function makeInformationRequest(username, serverURL) {
  const requestBody = {requestType: 'info', username: username };

  try { 
    const registerResponse = await sendAPIRequest(requestBody, serverURL);
    return registerResponse;

  } 
  catch (error) {
    console.error("Error while retrieving information.", error);
    return null;
  }
}