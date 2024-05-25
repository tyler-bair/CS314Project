import React from 'react';
import { Link, useLocation} from "react-router-dom";

export default function UserProfile() {
    const location = useLocation();

    const capitalizeFirstLetter = (text) => {
        let string = text;
        return (string[0].toUpperCase() + string.slice(1));
    }
   
	return ( <h1 className= "text-center">Welcome to Your Profile {capitalizeFirstLetter(location.state.username)}!</h1> );
}