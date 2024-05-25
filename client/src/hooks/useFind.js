import {useEffect, useState, useRef} from 'react';
import { LOG } from '../utils/constants';
import { getOriginalServerUrl } from '../utils/restfulAPI';
import { sendAPIRequest } from '../utils/restfulAPI';

export default function useFind(requestInput) {
    const [findPlaces, setPlacesFound] = useState([]);
    const find = {
        findPlaces: findPlaces
    }

    const findActions = {
        setPlacesFound: setPlacesFound
    }
    const didMount = useRef(false);
    useEffect(() => {
        if (didMount.current)  makeFindRequest(requestInput, getOriginalServerUrl(), findActions);

        else didMount.current = true;

    }, [requestInput])

    return {find};
}

async function makeFindRequest(input, serverURL, findActions) {
    const { setPlacesFound } = findActions;

    const requestBody = {requestType: "find", match: input, limit: 20};
    const findResponse = await sendAPIRequest(requestBody, serverURL);

    if(findResponse) {
        setPlacesFound(findResponse.places);
        setFound(findResponse.found);
    } else {
        LOG.error(`Find request to ${serverURL} failed. Check the log for more details.`, "error");
    }
}