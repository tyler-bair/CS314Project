import { getOriginalServerUrl, sendAPIRequest } from '../utils/restfulAPI'

export default function useLogin(){
  
  const checkLogin = async (username, password) => {
    const serverURL = getOriginalServerUrl();

    try {
      const registerResponse = await makeLoginRequest(username, password, serverURL);

      if(registerResponse) {
        console.log(`Login request to ${serverURL} successful`);
        return registerResponse;

      }
      else {
        console.error(`Login request to ${serverURL} failed.`);
      }
    } catch (error) {
      console.error("Error while logging in user.", error);
    }
  };
  return { checkLogin };
}

async function makeLoginRequest(username, password, serverURL) {
  const requestBody = {requestType: 'login', username: username, password: password };

  try { 
    const registerResponse = await sendAPIRequest(requestBody, serverURL);
    return registerResponse;

  } 
  catch (error) {
    console.error("Error while loggin in user.", error);
    return null;
  }
}