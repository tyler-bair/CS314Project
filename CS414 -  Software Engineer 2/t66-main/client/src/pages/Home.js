import React, { useState } from 'react';
import { Link, useNavigate } from "react-router-dom";
import { UserStats } from '../user/UserStats';
import { UserGameHistory } from '../user/UserGameHistory';
import Header from '../components/Header';
import { CreateGame } from '../game/CreateGame';


export default function Home(props) {
    return( 
        <div>
            <Header/>
            <UserStats/>
            <UserGameHistory/>
            <CreateGame/>
        </div>
    );
}