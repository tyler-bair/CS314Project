import React from 'react';
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Login from '../../src/pages/Login';
import Home from '../../src/pages/Home';
import { beforeEach, describe, expect, it } from '@jest/globals';

describe('quasy14: Home', () => {
    it('quasy14: Home renders without any issues', () => {
        const renderHome = render(
        <Router>
            <Login>
                <Home/>
            </Login>
        </Router> );
        expect(renderHome).toBeTruthy();
    });   
})