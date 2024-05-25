import React from 'react';
import { Button } from 'reactstrap';
import useMatch from '../hooks/useMatch';
import { useLocation } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';

export const CreateGame = () => {
  const { checkMatch } = useMatch();
  const location = useLocation();
  const navigate = useNavigate();
  const fenState = 'rnbqkbnr/pp1ppppp/8/2p5/4P3/5N2/PPPP1PPP/RNBQKB1R b KQkq - 1 2'

  const handleGameHistory = async () => {
    const matchResponse = await checkMatch(location.state.username, '', 'create', 1, fenState);
    if(matchResponse) {
      setTimeout(() => {
        navigate('/game', {state:{username: location.state.username, fenState: fenState}}); }, 300);
    }
  };

  return (
    <div className="text-center"> 
      <Button onClick={handleGameHistory}>
        Create New Game
      </Button>
    </div>
  )
}

