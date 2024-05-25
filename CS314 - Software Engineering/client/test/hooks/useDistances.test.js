import '@testing-library/jest-dom';
import { beforeEach, describe, expect, jest, test } from "@jest/globals";
import { renderHook } from "@testing-library/react-hooks";
import { calcCumulative, calcTotal, useDistances } from "../../src/hooks/useDistances";
import {act} from "@testing-library/react";

describe('useDistances', () => {

    const mockDistances = [10, 15, 37, 20];
    const testDistances = [1, 17, 256, 2];
    const testNoDistances = [0, 0, 0, 0];
    const testNegativeDistances = [-1, -10, 100, 3];

    let hook;
    beforeEach(() => {
        act(() => {
        jest.clearAllMocks();
        fetch.resetMocks();
        const { result } = renderHook(() => useDistances());
        hook = result;
        });
    });

    test('tyler-bair: calcCumulative', async () => {
        expect(calcCumulative(mockDistances)).toStrictEqual([10, 25, 62, 82]);
    });

    test('tyler-bair: calcTotal', async () => {
        expect(calcTotal(mockDistances)).toEqual(82);
    });

    test('leeann23: calcCumulative', async () => {
        expect(calcCumulative(testDistances)).toStrictEqual([1, 18, 274, 276]);
    });

    test('leeann23: calcTotal', async () => {
        expect(calcTotal(testDistances)).toEqual(276);
    });
    
    test('aninx: calcCumulative', async () => {
        expect(calcCumulative(testNoDistances)).toStrictEqual([0, 0, 0, 0]);
    });
    
    test('aninx: calcTotal', async () => {
        expect(calcTotal(testNoDistances)).toEqual(0);
    });

    test('maxcolb: calcCumulative', async () => {
        expect(calcCumulative(testNegativeDistances)).toEqual("No negatives allowed");
    });

    test('maxcolb: calcTotal', async() => {
        expect(calcTotal(testNegativeDistances)).toEqual(0);
    })
 });
