import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import Home from '../../src/pages/Home';
import Game from '../../src/pages/Game';
import { describe, expect, it } from '@jest/globals';

describe('quasy14: Game', () => {
    it('quasy14: Game renders without any issues', () => {
        const renderGame = render(
        <Router>
            <Login>
                <Home>
                    <Game/>
                </Home>
            </Login>
        </Router> );
        expect(renderGame).toBeTruthy();
    });   
})