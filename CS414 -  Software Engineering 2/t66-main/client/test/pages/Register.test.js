import React from 'react'
import { render } from '@testing-library/react';
import { BrowserRouter as Router } from 'react-router-dom';
import Register from '../../src/pages/Register';
import { beforeEach, describe, expect, it } from '@jest/globals';

describe('tbair: Register', () => {
    it('tbair: Register renders without any issues', () => {
        const renderRegister = render(
            <Router>
                <Register/>
            </Router>);
        expect(renderRegister).toBeTruthy();
    })
})