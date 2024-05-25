import { 
    createBrowserRouter, 
    RouterProvider,
  } from "react-router-dom"; 

import React, { useEffect, useState } from 'react';
import { useServerSettings } from '../hooks/useServerSettings';
import Login from '../pages/Login';
import Register from '../pages/Register';
import UserProfile from '../pages/UserProfile';
import ResetCredentials from "../pages/ResetCredentials";
import Home from "../pages/Home";
import Game from "../pages/Game";

export default function Router(props) {

    const [serverSettings, processServerConfigSuccess] = useServerSettings(props.showMessage);
    
    const router = createBrowserRouter([
        {
            path : "/",
            //element: <Page/>,
            children: [
                {
                    path: "/",
                    element: <Login {...props} />,
                },
                {
                    path: "/register",
                    element: <Register {...props} />,
                },
                {
                    path: "/home",
                    element: <Home {...props} />
                },
                {
                    path: "/userProfile",
                    element: <UserProfile {...props} />,
                },
                {
                    path: "/resetCredentials",
                    element: <ResetCredentials {...props} />,
                },
                {
                    path: "/game",
                    element: <Game {...props} />,
                }
            ],
        },
    ]);
   return (<RouterProvider router={router}/>)
};