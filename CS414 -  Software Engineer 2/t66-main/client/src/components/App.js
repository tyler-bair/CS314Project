import React from 'react';
import { SnackbarProvider, useSnackbar } from 'notistack';
import Router from './Router';

export default function App() {
    return (
        <SnackbarProvider maxSnack={3} preventDuplicate>
            <HookCaller />
        </SnackbarProvider>
    );
}

export const HookCaller = () => {
    const { enqueueSnackbar } = useSnackbar();

    function showMessage(message, variant = "info") {
        enqueueSnackbar(message, { variant: variant })
    }

    return <Router showMessage={showMessage} />;
};
