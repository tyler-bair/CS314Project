import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import { beforeEach, describe, expect, it } from '@jest/globals';


describe('quasy14: Login', () => {
    it('quasy14: Login renders without any issues', () => {
        const renderLogin = render(
        <Router>
            <Login/>
        </Router> );
        expect(renderLogin).toBeTruthy();
    });
    
})

describe('quasy14: Login Response', () => {
    let navigateToProfile;
    let setLoginMessage;

    beforeEach(() => {
        navigateToProfile = jest.fn();
        setLoginMessage = jest.fn();
    });

    const handleResponse = (response) => {
        response.loginSuccess === "true" ? navigateToProfile() : setLoginMessage(response.responseMessage);
    };

    it("quasy14: check that navigateToProfile is called when loginSuccess returns true", () => {
        const response = {
            loginSuccess: "true"
        };
        handleResponse(response);

        expect(navigateToProfile).toHaveBeenCalled();
        expect(setLoginMessage).not.toHaveBeenCalled();
    });

    it("quasy14: check that showError is called when loginSuccess returns as false.", () => {
        const response = {
            loginSuccess: "false"
        };
        handleResponse(response);

        expect(setLoginMessage).toHaveBeenCalled();
        expect(navigateToProfile).not.toHaveBeenCalled();
    });
});

