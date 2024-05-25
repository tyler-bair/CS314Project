import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import UserStats from '../../src/user/UserStats';
import { describe, expect, it } from '@jest/globals';

describe('quasy14: UserStats', () => {
    it('quasy14: UserStats renders without any issues', () => {
        const renderUserStats = render(
        <Router>
            <Login>
                <UserStats/>
            </Login>
        </Router> );
        expect(renderUserStats).toBeTruthy();
    });   
})