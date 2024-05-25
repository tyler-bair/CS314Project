import { useState, useEffect } from 'react';
import { LOG } from '../utils/constants';
import { sendAPIRequest, getOriginalServerUrl } from '../utils/restfulAPI';
import { useToggle } from '../hooks/useToggle';

export function useDistances(places, earthRadius, serverURL) {
    earthRadius = 3959.0;
    const [leg, setLeg] = useState([]);
    const [cumulative, setCumulative] = useState([]);
    const [total, setTotal] = useState(0);
    const[ firstTime, firstTimeToggle ] = useToggle(true);

    const distances = {
        leg: leg,
        cumulative: cumulative,
        total: total
    }
    
    const distanceActions = {
        setLeg: setLeg,
        setCumulative: setCumulative,
        setTotal: setTotal
    }

    useEffect(() => {
        if(firstTime){
            firstTimeToggle()
        }
        else{
            makeDistancesRequest(places, earthRadius, getOriginalServerUrl(), distanceActions)}}, [places]);

    return {distances};
}

async function makeDistancesRequest(places, earthRadius, serverURL, distanceActions) {
    const {setLeg, setCumulative, setTotal} = distanceActions;

    const requestBody = { requestType: "distances", places: places, earthRadius: earthRadius };
    const distancesResponse =  await sendAPIRequest(requestBody, serverURL);

    if(distancesResponse) {
        setLeg(distancesResponse.distances);
        setCumulative(calcCumulative(distancesResponse.distances));
        setTotal(calcTotal(distancesResponse.distances));
    } else {
        LOG.error(`Distance request to ${serverURL} failed. Check the log for more details.`, "error");
    }
}

export function calcCumulative(distances) {
    let cumTotal = 0;
    let cumArray = [];

    for(let t=0; t<distances.length; t++) {
        if(distances[t] < 0){
            return "No negatives allowed";
        }
        cumTotal += distances[t]
        cumArray.push(cumTotal);
    }
    return cumArray;
}

export function calcTotal(distances) {
    let tot = 0;

	for (let i = 0; i < distances.length; i++) {
		if(distances[i] < 0){
            return 0;
        }
        tot += distances[i];
	}
	return tot;
}