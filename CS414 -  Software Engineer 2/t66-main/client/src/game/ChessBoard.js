import React from 'react'
import { Chessboard } from "react-chessboard";

export default function ChessBoard(props) {
    return(
      <div className = "vertical-center justify-content-center" style={{paddingTop: 50}}>
        <div className = "col-md-6">
          <h3 className= "text-center">Chess Game</h3>
          <Chessboard position = {"start"} />
        </div>
      </div>
    );
}
