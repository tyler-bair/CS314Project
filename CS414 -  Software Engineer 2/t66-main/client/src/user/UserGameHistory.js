import React, { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';
import { Button } from 'reactstrap';
import useInformation from '../hooks/useInformation';
import { GameHistory } from '../game/GameHistory';

export const UserGameHistory = (props) => {
  const location = useLocation();
  const [games, setGames] = useState([]);

  useEffect(() => {
    handleGameHistory(location.state.username, setGames);
  }, []);

  return <GameHistory games={games} />;
};

const handleGameHistory = async (username, setGames) => {
  const { checkInformation } = useInformation();
  const informationResponse = await checkInformation(username);
  console.log(informationResponse);
  setGames((prevGames) => [
    ...prevGames,
    ...informationResponse.matchHistory.map((match) => ({
      matchID: match.MatchID,
      description: match.MatchStatus,
      opponent: match.OpponentUsername,
    })),
  ]);
};
