import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import UserProfile from '../../src/pages/UserProfile';
import { describe, expect, it } from '@jest/globals';

describe('quasy14: UserProfile', () => {
    it('quasy14: User Profile renders without any issues', () => {
        const renderUserProfile = render(
        <Router>
            <Login>
                <UserProfile/>
            </Login>
        </Router> );
        expect(renderUserProfile).toBeTruthy();
    });   
})