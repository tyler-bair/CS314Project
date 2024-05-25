import React, { useState } from 'react';
import { Link, useNavigate } from "react-router-dom";

import Header from '../components/Header';
import ChessBoard from '../game/ChessBoard';
import { CreateGame } from '../game/CreateGame';

export default function Game(props) {
    return( 
    <div>
        <Header/> 
        <ChessBoard/>
    </div>
    );
}