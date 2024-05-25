import React, { useEffect, useState } from 'react';
import ProgressBar from 'react-bootstrap/ProgressBar';
import useInformation from '../hooks/useInformation';
import {useLocation} from "react-router-dom";


export const UserStats = () => {
  const [percentCorrect, setPercentCorrect] = useState(0);
  const [percentWrong, setPercentWrong] = useState(0);
  const[gamesWon, setGamesWon] = useState(0);
  const[totalGames, setTotalGames] = useState(0);
  const location = useLocation();
  const { checkInformation } = useInformation();

  useEffect(() => {
    handleInfoRequest(location.state.username, setGamesWon, setTotalGames, setPercentCorrect, setPercentWrong);
  }, []);

  const calculatePercentCorrect = (response, setGamesWon, setTotalGames, setPercentCorrect, setPercentWrong) =>
  {
    let numGames = response.length;
    let totalGames = 0;
    let numGamesWon = 0;
    let numGamesLost = 0;
    for (let i = 0; i < numGames; i++)
    {
      console.log(response[i].Winner);
      if(response[i].Winner == location.state.username)
      {
        totalGames += 1;
        numGamesWon += 1;
      }
      else if(response[i].Winner != "none")
      {
        totalGames += 1;
        numGamesLost += 1;
      }
    }
    setGamesWon(numGamesWon);
    setTotalGames(totalGames);
    numGamesWon === 0 ? setPercentCorrect(0) : setPercentCorrect((Math.round((numGamesWon/totalGames) * 100)));
    numGamesLost == 0 ? setPercentWrong(0) : setPercentWrong(100 - (Math.round((numGamesWon/totalGames) * 100)));
  }

  const handleInfoRequest = async (username, setGamesWon, setTotalGames, setPercentCorrect, setPercentWrong) => {
    const response = await checkInformation(username);
    calculatePercentCorrect(response.matchHistory, setGamesWon, setTotalGames, setPercentCorrect, setPercentWrong);
  }

  return (
    <div className='justify-content-center' style={{marginLeft: '300px', marginRight: '300px', paddingTop: 50}}>
      <h2 className="text-center">Game Statistics</h2>
      <ProgressBar>
        <ProgressBar striped variant="green" label={gamesWon} now={percentCorrect} key={1} />
        <ProgressBar striped variant="danger" label={totalGames - gamesWon} now={percentWrong} key={2} />
      </ProgressBar>
      <p className ="text-center">You have won {gamesWon} out of {totalGames} completed games. {percentCorrect}%</p>
    </div>
  )
}
