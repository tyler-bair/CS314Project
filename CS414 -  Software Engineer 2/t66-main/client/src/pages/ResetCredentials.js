import React, { useEffect, useState } from 'react';
import { useServerSettings } from '../hooks/useServerSettings';
import { Link } from "react-router-dom";

export default function ResetCredentials(props) {
    const [serverSettings, processServerConfigSuccess] = useServerSettings(props.showMessage);
    
	return (<h1>Reset Credentials Page</h1>);
}