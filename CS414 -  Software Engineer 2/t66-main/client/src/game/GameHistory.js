import React from 'react'
import { useLocation } from 'react-router-dom';
import { Button } from 'reactstrap';


export const GameHistory = ({ games }) => {
  return (
    <div style={{ maxWidth: '800px', margin: '0 auto' }}>
      <div className="vertical-center justify-content-center">
        <table className="table">
          <thead>
            <tr >
              <th colSpan='4' style={{ textAlign: 'center' }}>Game History</th>
            </tr>
            <tr>
              <th style={{textAlign: 'center'}} >Match ID</th>
              <th style={{textAlign: 'center'}}>Description</th>
              <th style={{textAlign: 'center'}}>Opponent</th>
              <th style={{textAlign: 'center'}}> Play Game</th>
            </tr>
          </thead>
          <tbody>
            {games.map((game, index) => (
              <tr key={index}>
                <td style={{textAlign: 'center'}}>{game.matchID}</td>
                <td style={{textAlign: 'center'}}>{game.description}</td>
                <td style={{textAlign: 'center'}}>{game.opponent}</td>
                <td style={{textAlign: 'center'}}>
                  <Button color='btn btn-primary' onClick={() => loadGame(game.name)}>Play</Button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  )
}

const loadGame = (gameName) => {
  console.log(gameName);
};

