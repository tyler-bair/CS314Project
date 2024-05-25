import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import Home from '../../src/pages/Home';
import ChessBoard from '../../src/game/ChessBoard';
import Game from '../../src/pages/Game';
import { describe, expect, it } from '@jest/globals';

describe('quasy14: ChessBoard', () => {
    it('quasy14: ChessBoard renders without any issues', () => {
        const renderChessBoard = render(
        <Router>
            <Login>
                <Home>
                    <Game>
                        <ChessBoard/>
                    </Game>
                </Home>
            </Login>
        </Router> );
        expect(renderChessBoard).toBeTruthy();
    });   
})