import React from 'react';
import {act, render, screen} from '@testing-library/react';
import '@testing-library/jest-dom';
import user from '@testing-library/user-event';
import { beforeEach, describe, expect, test, jest } from '@jest/globals';
import { MOCK_PLACES, VALID_DISTANCES_RESPONSE } from '../../sharedMocks';
import Itinerary from '../../../src/components/Trip/Itinerary/Itinerary.js';

describe('Itinerary', () => {
	const placeActions = { append: jest.fn(), selectIndex: jest.fn() };
	beforeEach(() => {
		act(() => {
			fetch.resetMocks();
			fetch.mockResponse(VALID_DISTANCES_RESPONSE);
			render(
				<Itinerary
					places={MOCK_PLACES}
					placeActions={placeActions}
					selectedIndex={0}
					distances={{leg: [1, 1, 1, 1, 1]}}
				/>
			);
		});
	});

	test('base: renders the name attribute', () => {
		act(() => {
			screen.getByRole('cell', { name: /Place A/i });
		});
	});

    
	test('base: sets new index when clicked.', () => {
		const row = screen.getByTestId('place-row-0');
		expect(placeActions.selectIndex).toBeCalledTimes(0);

		user.click(row);
		expect(placeActions.selectIndex).toBeCalledTimes(1);
	});

	test('base: expands a place row when clicked.', () => {
		const row = screen.getByTestId('place-row-2');
		expect(screen.getByText(/123 Test/i)).toBeTruthy();

		user.click(row);
		expect(screen.getByText(/expanded test/i)).toBeTruthy();
	});

	test('base: expands a place row when button is clicked.', () => {
		const toggle = screen.getByTestId('place-row-toggle-2');
		expect(screen.getByText(/123 Test/i)).toBeTruthy();

		user.click(toggle);
		expect(screen.getByText(/expanded test/i)).toBeTruthy();
	});
});
